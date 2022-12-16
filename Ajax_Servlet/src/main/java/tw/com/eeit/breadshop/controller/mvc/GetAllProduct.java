package tw.com.eeit.breadshop.controller.mvc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.conn.ConnectionFactory;
import tw.com.eeit.breadshop.dao.ProductDAO;

@WebServlet("/GetAllProduct.do")
public class GetAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ProductDAO pDAO = new ProductDAO();
		List<Product> pList = pDAO.getAllProduct();
		pDAO.closeConn();

		request.setAttribute("products", pList);
		request.getRequestDispatcher("1_mvc/ShowProduct.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
