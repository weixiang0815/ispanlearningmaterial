package tw.com.eeit.breadshop.controller.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.gson.Gson;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.dao.ProductDAO;

@MultipartConfig
@WebServlet("/Products/*")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json;charset=UTF-8");
		String pathInfo = request.getPathInfo();
		Boolean isFuzzySearch = Boolean.valueOf(request.getParameter("fuzzy"));

		ProductDAO pDAO = new ProductDAO();
		List<Product> pList = new ArrayList<Product>();

		// 沒有額外的路徑資訊，代表要取得所有商品
		if (pathInfo == null) {
			pList = pDAO.getAllProduct();
		}

		// 有額外的路徑資訊，且模糊搜尋的參數值為false，代表取得指定ID的商品
		if (pathInfo != null && !isFuzzySearch) {
			String pID = pathInfo.substring(1);
			Product p = pDAO.getProductByID(pID);
			pList.add(p);
		}

		// 有額外的路徑資訊，且模糊搜尋的參數值為true，代表用關鍵字做模糊搜尋
		if (pathInfo != null && isFuzzySearch) {
			String keyword = pathInfo.substring(1);
			pList = pDAO.getProductByNameWithKeyword(keyword);
		}

		pDAO.closeConn();

		String pListJson = new Gson().toJson(pList);

		PrintWriter out = response.getWriter();
		out.write(pListJson);
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");

		String cpName = request.getParameter("cpName");
		Integer cpPrice = Integer.valueOf(request.getParameter("cpPrice"));
		Part cpPhoto = request.getPart("cpPhoto");
		String cpPhotoBase64 = "";
		if (cpPhoto.getSize() >= 100) {
			cpPhotoBase64 = "data:image/jpeg;base64,"
					+ Base64.getEncoder().encodeToString(cpPhoto.getInputStream().readAllBytes());
		}

		Product p = new Product(cpName, cpPrice, cpPhotoBase64);

		ProductDAO pDAO = new ProductDAO();

		pDAO.insertProduct(p);

		pDAO.closeConn();

	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/plain;charset=UTF-8");
		String pathInfo = request.getPathInfo();
		Boolean status = false;

		ProductDAO pDAO = new ProductDAO();

		// 如果沒有額外的路徑資訊，表示要刪除所有商品
		if (pathInfo == null) {
		}

		// 如果有額外的路徑資訊，表示要刪除指定ID的商品
		if (pathInfo != null) {
			String pID = pathInfo.substring(1);
			status = pDAO.deleteProductByID(pID);
		}

		pDAO.closeConn();

		PrintWriter out = response.getWriter();
		out.write(status.toString());
		out.close();

	}

	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain;charset=UTF-8");
		String pathInfo = request.getPathInfo();

		String pName = request.getParameter("pName");
		Integer pPrice = Integer.valueOf(request.getParameter("pPrice"));
		Part pPhoto = request.getPart("pPhoto");
		String pPhotoBase64 = "";
		if (pPhoto.getSize() >= 100) {
			pPhotoBase64 = "data:image/jpeg;base64,"
					+ Base64.getEncoder().encodeToString(pPhoto.getInputStream().readAllBytes());
		}

		ProductDAO pDAO = new ProductDAO();
		Boolean status = false;

		// 如果沒有額外的路徑資訊，表示要大量更新商品(可能要帶上參數)
		if (pathInfo == null) {
		}

		// 如果有額外的路徑資訊，表示更新指定商品
		if (pathInfo != null) {
			String pID = pathInfo.substring(1);
			Product p = new Product(pName, pPrice, pPhotoBase64);
			status = pDAO.updateProduct(pID, p);
		}

		pDAO.closeConn();

		PrintWriter out = response.getWriter();
		out.write(status.toString());
		out.close();

	}

}
