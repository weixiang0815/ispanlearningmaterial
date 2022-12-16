package tw.com.eeit.breadshop.controller.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.dao.ProductDAO;

@WebServlet("/GetProductByID.do")
public class GetProductByID extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pID = request.getParameter("productID");
		ProductDAO pDAO = new ProductDAO();
		Product p = pDAO.getProductByID(pID);
		pDAO.closeConn();

		request.setAttribute("p", p);
		request.getRequestDispatcher("1_mvc/ProductDetail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
