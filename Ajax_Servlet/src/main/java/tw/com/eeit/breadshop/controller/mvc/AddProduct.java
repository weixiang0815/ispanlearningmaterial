package tw.com.eeit.breadshop.controller.mvc;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.coyote.http11.filters.BufferedInputFilter;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.dao.ProductDAO;

@MultipartConfig
@WebServlet("/AddProduct.do")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String pName = request.getParameter("productName");
		int pPrice = Integer.valueOf(request.getParameter("productPrice"));

		Part pPhoto = request.getPart("productPhoto");

		String pPhotoBase64 = "";
		if (pPhoto.getSize() != 0) {
			pPhotoBase64 = "data:image/jpeg;base64,"
					+ Base64.getEncoder().encodeToString(pPhoto.getInputStream().readAllBytes());
		}

		if (pPhoto.getSize() == 0) {
			BufferedInputStream bis = new BufferedInputStream(
					new URL("https://fakeimg.pl/420x420/?text=image").openStream());
			byte[] bytes = bis.readAllBytes();
			bis.close();
			pPhotoBase64 = "data:image/jpeg;base64," + Base64.getEncoder().encodeToString(bytes);
		}

		Product p = new Product(pName, pPrice, pPhotoBase64);

		ProductDAO pDAO = new ProductDAO();
		pDAO.insertProduct(p);
		pDAO.closeConn();

		response.sendRedirect("GetAllProduct.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
