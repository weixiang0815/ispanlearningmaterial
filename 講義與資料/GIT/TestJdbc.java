package tw.pers.test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestJdbc {
	public static void main(String[] args) throws Exception {
		getImg();
	}

	public static void getImg() throws Exception {
		String connectionURL = "jdbc:sqlserver://localhost:1433;database=jspdb;user=sa;password=1234;trustServerCertificate=true;";
		String SQL = "SELECT * FROM Product";

		Connection conn = DriverManager.getConnection(connectionURL);

		PreparedStatement preState = conn.prepareStatement(SQL);
		ResultSet rs = preState.executeQuery();

		while (rs.next()) {
			if (rs.getString("PRODUCT_ID").equals("1002")) {

				byte[] bytes = rs.getBytes("IMAGE");

				FileOutputStream fos = new FileOutputStream("C:\\temp\\A.jpg");

				fos.write(bytes);

				fos.close();
				
			}
		}

		rs.close();
		preState.close();
		conn.close();
	}

	public static void insertImg() throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Student\\Desktop\\doge.jpg"));

		byte[] bytes = bis.readAllBytes();

		bis.close();

		String connectionURL = "jdbc:sqlserver://localhost:1433;database=jspdb;user=sa;password=1234;trustServerCertificate=true;";
		String SQL = "INSERT INTO Product(PRODUCT_NAME,IMAGE) VALUES ('AAA',?)";

		Connection conn = DriverManager.getConnection(connectionURL);

		PreparedStatement preState = conn.prepareStatement(SQL);
		preState.setBytes(1, bytes);

		preState.execute();
		preState.close();
		conn.close();
	}

}
