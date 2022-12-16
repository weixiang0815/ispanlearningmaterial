package tw.com.eeit.breadshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.conn.ConnectionFactory;

public class ProductDAO {

	private Connection conn;

	public ProductDAO() {
		try {
			conn = ConnectionFactory.getconnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根據ID取得指定商品
	 * 
	 * @return Product 商品的JavaBean
	 */
	public Product getProductByID(String id) {
		String SQL = "SELECT * FROM product WHERE id = ?";

		Product p = new Product();
		try {
			PreparedStatement preState = conn.prepareStatement(SQL);
			preState.setString(1, id);
			ResultSet rs = preState.executeQuery();
			if (rs.next()) {
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setPhoto(rs.getString("photo"));
				p.setPrice(rs.getInt("price"));
			}
			rs.close();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}

	/**
	 * 取得所有商品，回傳商品列表。
	 * 
	 * @return List 商品列表
	 */
	public List<Product> getAllProduct() {
		String SQL = "SELECT * FROM product";

		List<Product> pList = new ArrayList<Product>();
		try {
			PreparedStatement preState = conn.prepareStatement(SQL);
			ResultSet rs = preState.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setPhoto(rs.getString("photo"));
				p.setPrice(rs.getInt("price"));
				pList.add(p);
			}
			rs.close();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}

	/**
	 * 根據關鍵字取得商品，回傳商品列表。
	 * 
	 * @param keyword 模糊搜尋關鍵字
	 * @return List 商品列表
	 */
	public List<Product> getProductByNameWithKeyword(String keyword) {
		String SQL = "SELECT * FROM product WHERE name LIKE ?";

		List<Product> pList = new ArrayList<Product>();
		try {
			PreparedStatement preState = conn.prepareStatement(SQL);
			preState.setString(1, "%" + keyword + "%");
			ResultSet rs = preState.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getString("id"));
				p.setName(rs.getString("name"));
				p.setPhoto(rs.getString("photo"));
				p.setPrice(rs.getInt("price"));
				pList.add(p);
			}
			rs.close();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pList;
	}

	/**
	 * 根據商品ID刪除指定商品，成功回傳true，失敗回傳false。
	 * 
	 * @param id 商品ID
	 * @return boolean 【true】刪除成功；【false】刪除失敗
	 */
	public boolean deleteProductByID(String id) {
		String SQL = "DELETE FROM product WHERE id = ?";
		try {
			PreparedStatement preState = conn.prepareStatement(SQL);
			preState.setString(1, id);
			preState.execute();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 根據商品ID修改指定商品的資料，成功回傳true，失敗回傳false。
	 * 
	 * @param id 商品ID
	 * @param p  商品的更新資訊
	 * @return boolean 【true】刪除成功；【false】刪除失敗
	 */
	public boolean updateProduct(String id, Product p) {
		String photo = p.getPhoto().equals("") ? "" : ", photo = ?";

		String SQL = "UPDATE product SET name = ?, price = ?" + photo + " WHERE id = ?;";
		try {
			PreparedStatement preState = conn.prepareStatement(SQL);

			preState.setString(1, p.getName());
			preState.setInt(2, p.getPrice());

			if (!p.getPhoto().equals("")) {
				preState.setString(3, p.getPhoto());
				preState.setString(4, id);
			} else {
				preState.setString(3, id);
			}

			preState.execute();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 新增商品，ID會使用java.util.UUID產生。
	 * 
	 * @param p 要新增的商品，無須附上ID
	 */
	public void insertProduct(Product p) {
		String SQL = "INSERT INTO product(id, name, price, photo) VALUES(?, ?, ?, ?)";

		try {
			PreparedStatement preState = conn.prepareStatement(SQL);

			preState.setString(1, UUID.randomUUID().toString());
			preState.setString(2, p.getName());
			preState.setInt(3, p.getPrice());
			preState.setString(4, p.getPhoto());

			preState.execute();
			preState.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeConn() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	};
}
