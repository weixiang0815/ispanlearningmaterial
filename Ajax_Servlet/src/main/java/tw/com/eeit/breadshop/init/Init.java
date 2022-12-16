package tw.com.eeit.breadshop.init;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import tw.com.eeit.breadshop.bean.Product;
import tw.com.eeit.breadshop.conn.ConnectionFactory;

//此初始化與AJAX無關
@WebListener
public class Init implements ServletContextListener {

	private final String CREATE_PRODUCTS_TABLE = "CREATE TABLE IF NOT EXISTS product(id TEXT PRIMARY KEY NOT NULL, name TEXT NOT NULL, price INT, photo TEXT)";
	private final String DROP_PRODUCTS_TABLE = "DROP TABLE IF EXISTS product";

	private final String INSERT_PRODUCTS_TABLE = "INSERT INTO product(id, name, price, photo) VALUES (?, ?, ?, ?)";

	private final String PRODUCTS_PATH = "WEB-INF/init_data/products.json";
	private String realPath = "";

	/**
	 * 初始化，第一次啟動server時，建立資料庫SQLite.db，建立資料product，並新增預設資料。
	 *
	 * 如web.xml中的「SQLiteReset」屬性為true，則每次啟動server時都會重建資料表。
	 */
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();

		realPath = sce.getServletContext().getRealPath("");
		context.setAttribute("root", context.getContextPath());

		Boolean resetDb = Boolean.valueOf(context.getInitParameter("SQLiteReset"));

		try (Connection conn = ConnectionFactory.getconnection()) {
	

			if (resetDb) {
				dropTables(conn);
			}

			createTables(conn);

			addBasicData(conn);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 建立資料product，如果資料表已經存在，則不做任何事情。
	 */
	private void createTables(Connection conn) throws Exception {

		Statement state = conn.createStatement();

		state.addBatch(CREATE_PRODUCTS_TABLE);
		state.executeBatch();
		state.close();

	}

	/**
	 * 刪除資料表product，如果資料表不存在，則不做任何事情。
	 */
	private void dropTables(Connection conn) throws Exception {

		Statement state = conn.createStatement();

		state.addBatch(DROP_PRODUCTS_TABLE);

		state.executeBatch();
		state.close();

	}

	/**
	 * 新增預設資料，如果product資料表中有任何一筆資料，則終止其資料新增的行為。
	 */
	private void addBasicData(Connection conn) throws Exception {

		// 如果product資料表中有任何一筆資料，則終止此方法。
		if (conn.createStatement().executeQuery("SELECT id FROM product").next()) {
			return;
		}

		// 使用Gson、JavaIO，讀取webapp/WEB-INF/init_data/products.json的資料
		BufferedReader br = new BufferedReader(new FileReader(realPath + PRODUCTS_PATH));
		List<Product> pList = new Gson().fromJson(br, new TypeToken<List<Product>>() {
		}.getType());

		// 新增資料到資料表
		PreparedStatement preState = conn.prepareStatement(INSERT_PRODUCTS_TABLE);
		for (Product p : pList) {
			preState.setString(1, p.getId());
			preState.setString(2, p.getName());
			preState.setInt(3, p.getPrice());
			preState.setString(4, p.getPhoto());
			preState.addBatch();
		}
		preState.executeBatch();
		preState.close();

	}

}
