package mssql.ex00.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import mssql.ex00.SystemConstant;
import mssql.ex00.dao.ProductDao;
import mssql.ex00.model.ProductBean;
import mssql.lab05.ProductNotFoundException;


/*
現有Product表格的結構如下:
產品代號:		PRODUCT_ID 			整數, IDENTITY 	 		主要鍵
產品名稱:		PRODUCT_NAME   		變動長度字串(255) 
單價:	 		PRICE		 		定點數(9,1)
數量:			QUANTITY   			整數 
建檔日期:		PRODUCT_DATE  		DateTime
圖片:			IMAGE				BLOB
說明:			REMARK				CLOB
檔案名稱:		FileName			變動長度字串(255)

*/
public class ProductDaoImpl implements ProductDao {
	public ProductDaoImpl() {
	}

	// 新增單筆產品紀錄
	@SuppressWarnings("unused")
	@Override
	public void save(ProductBean productBean) throws SQLException {
		// 提示 1.變數 sql的內容為一個INSERT INTO敘述，具備下列格式：
		// INSERT INTO Product VALUES(......);
		// 第一個欄位為自動遞增的主鍵，應以null表示，其他欄位的值皆用 ? 來表示
		// 其格式如下：
		// INSERT INTO Product (欄位1, 欄位2, ... ) VALUES(?, ? ......);

		String sql = "INSERT INTO Product (PRODUCT_NAME, PRICE, QUANTITY, "
				+ " PRODUCT_DATE, IMAGE, REMARK, FileName) "
				+ " VALUES (?, ?, ?, ?, ?, ?, ?) ";
		// 提示 2. 利用Try-With-Resource來開啟Connection物件與PreparedStatement物件
		
		  try ( 
		    Connection con = DriverManager.getConnection(
					    		SystemConstant.getDbURL(), 
					    		SystemConstant.getUser(), 
					    		SystemConstant.getPassword() 
		    		          ); 
		    PreparedStatement stmt = con.prepareStatement(sql); 
		  ) { 
			 // 提示 3. 
			 //   SQL敘述內的每一個 ? 都必須由productBean內的屬性置換之。 
			 // stmt.setXXX(?的流水編號, productBean.getXXX());
			  stmt.setString(1, productBean.getProductName());
			  stmt.setDouble(2, productBean.getPrice());
			  stmt.setInt(3, productBean.getQuantity());
			  stmt.setTimestamp(4, productBean.getProductDate());
			  stmt.setBlob(5, productBean.getImage());
			  stmt.setClob(6, productBean.getRemark());
			  stmt.setString(7, productBean.getFileName());
			  // 提示 4. 執行PreparedStatement的executeUpdate() 
			  stmt.executeUpdate();
		 // .... 
		 } 
		 // 要拋出例外
	}
	// 依鍵值刪除單筆產品紀錄
	@SuppressWarnings("unused")
	@Override
	public void deleteById(int key) throws SQLException {
		// 提示 1.變數 sql的內容為一個DELETE敘述，具備下列的格式：
		// DELETE FROM Product WHERE (某個條件);
		// 如果沒有條件，DELETE敘述會刪除表格內所有紀錄。
		//
		String sql = "DELETE FROM Product WHERE Product_id = ?";
		// 提示 2. 利用Try-With-Resource來開啟Connection物件與PreparedStatement
		// 物件
		try ( 
			Connection con = DriverManager.getConnection(
					SystemConstant.getDbURL(), 
					SystemConstant.getUser(),
					SystemConstant.getPassword() ); 
			PreparedStatement stmt = con.prepareStatement(sql); // 這裡需要傳入變數sql 
		){
		 // 提示 3. SQL敘述內的唯一一個 ? 必須由參數key置換之。 
		    stmt.setInt(1, key); 
		 //	提示 4.
		 // 執行PreparedStatement的executeUpdate() 
		    int n = stmt.executeUpdate();
		    if ( n == 0) {
		    	throw new ProductNotFoundException(key);
		    } 
	    }
		// 要拋出例外
	}

	// 修改單筆產品紀錄
	@SuppressWarnings("unused")
	@Override
	public void update(ProductBean productBean) {
		// 提示 1.變數 sql的內容為一個UPDATE敘述，具備下列格式：
		// UPDATE Product SET 欄位1 = ?, 欄位2 = ? ....... WHERE (某個條件); 
		// 如果沒有條件，UPDATE敘述會修改表格內所有紀錄。
		String sql = null; 
		//
		
		// 提示 2. 利用Try-With-Resource來開啟Connection物件與PreparedStatement
		// 物件
		
		// try ( 
		//  Connection con = null;
		//  PreparedStatement stmt = null;  // 這裡需要傳入變數sql 
		// ) 
		// { 提示 3. SQL敘述內的每一個 ? 都必須由bean內的對應屬性置換之。 
		// stmt.setXXX(?的流水編號, productBean.getXXX()); 
		// 提示 4. 執行PreparedStatement的executeUpdate()
		// } 
		// 提示 5. 
		// 要拋出例外
	}

	// 查詢所有(或多筆)產品紀錄
	@SuppressWarnings("unused")
	@Override
	public List<ProductBean> findAll() throws SQLException {
		// 提示 1.變數 sql的內容為一個SELECT敘述，具備下列的格式：
		// SELECT * FROM Product;
		//
		String sql = null;
		// 定義一個能夠封裝多個ProductBean的List物件
		ProductBean productBean = null;
		List<ProductBean> beans = null;
		// 提示 2. 利用Try-With-Resource來開啟Connection物件、PreparedStatement
		// 與ResultSet物件
		
		// try ( 
		// Connection con = .... 
		// PreparedStatement stmt = ..... // 這裡需要傳入變數sql
		// ResultSet rs = ........ ){ 提示 3.
		// 執行PreparedStatement的executeQuery()，傳回值為ResultSet物件
		//
		// 
		// 提示 4. 執行while (rs.next()) { // 迴圈內仍有資料未取出，
		// 
		// 將ResultSet物件游標所指的該筆紀錄內的值取出， 然後用一個ProductBean物件裝起來
		// 
		// 將這個ProductBean物件放入大貨櫃內 
		//      } 
		//    } 
		// }
		
		return beans;
	}

	// 依鍵值查詢單筆產品紀錄
	@Override
	public ProductBean findById(int key) throws SQLException {
		// 提示 1.變數 sql的內容為一個SELECT敘述，具備下列的格式：
		// SELECT * FROM Product WHERE (主鍵名稱 = ? );
		//
		ProductBean productBean = null;

		// 提示 2. 利用Try-With-Resource來開啟Connection物件與PreparedStatement
		// 物件
		//
		// try ( 
		// Connection con = .... 
		// PreparedStatement stmt = ..... // 這裡需要傳入變數sql 
		// ){
		// 提示 3. SQL敘述內的唯一一個 ? 必須由參數key置換之。 
		// stmt.setXXX(1, key); 
		// 提示 4.
		// 執行PreparedStatement的executeQuery()，傳回值為ResultSet物件 rs 
		// try( ???????????  
		//      
		// ){ 
		//      if (rs.next()){ // 查到資料 將 rs內的值全部取出，然後用一個
		//          ProductBean物件裝起來 
		//      } 
		//  } 
		// } 
		// 提示 5. 這裡要處理相關的例外
		 //
		return productBean;
	}
}