package tw.com.eeit.breadshop.controller.mvc;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.dao.ProductDAO;

@MultipartConfig
@WebServlet("/UpdateProduct.do")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String pID = request.getParameter("productID");
		String pName = request.getParameter("productName");
		int pPrice = Integer.valueOf(request.getParameter("productPrice"));
		Part pPhoto = request.getPart("productPhoto");

		String pPhotoBase64 = "";
		if (pPhoto.getSize() != 0) {
			pPhotoBase64 = "data:image/jpeg;base64,"
					+ Base64.getEncoder().encodeToString(pPhoto.getInputStream().readAllBytes());
		}

		Product p = new Product(pID, pName, pPrice, pPhotoBase64);

		ProductDAO pDAO = new ProductDAO();
		boolean isUpdated = pDAO.updateProduct(pID, p);

		p = pDAO.getProductByID(pID);

		pDAO.closeConn();

		request.setAttribute("p", p);

		if (isUpdated) {
			request.setAttribute("message", "更新成功");
		} else {
			request.setAttribute("message", "更新失敗");
		}

		request.getRequestDispatcher("1_mvc/ProductDetail.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
