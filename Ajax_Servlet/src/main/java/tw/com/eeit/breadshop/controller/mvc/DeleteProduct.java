package tw.com.eeit.breadshop.controller.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.dao.ProductDAO;

@WebServlet("/DeleteProductByID.do")
public class DeleteProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pID = request.getParameter("productID");
		ProductDAO pDAO = new ProductDAO();
		pDAO.deleteProductByID(pID);

		pDAO.closeConn();
		response.sendRedirect("GetAllProduct.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
