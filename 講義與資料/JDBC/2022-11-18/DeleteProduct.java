package mssql.lab05;

// 刪除產品資料
/*
文字檔data/product/ProductDeleteData.txt內有多筆產品的主鍵，逐筆讀入ProductDeleteData.txt檔案內的每一列資料，然後呼叫
ProductDaoImpl類別的deleteByPrimaryKey()方法刪除此筆產品資料。
你需要完成本類別與mssql.lab04.dao.ProductDaoImpl.deleteById()方法
*/
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import mssql.ex00.dao.ProductDao;
import mssql.ex00.dao.impl.ProductDaoImpl;


public class DeleteProduct {
	public static void main(String args[]) {
		// 開啟BufferedReader類別，因為它可以讀入文字檔的一橫列資料
		try (
			FileInputStream fis = new FileInputStream
                ("data/product/ProductDeleteData.txt"); 
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);	
		) {
			String line = null;
			ProductDao productDao = new ProductDaoImpl();
			// 利用while迴圈，每次讀入一列的資料
			
			while ( (line = br.readLine()) != null){
				// 將字串轉換為整數
				int key = 0;
				try {
					key = Integer.parseInt(line.trim());
				} catch(NumberFormatException e) {
					;
				}
				// 呼叫ProductDaoImpl類別的deleteById()方法刪除此筆資料。
				try {
					productDao.deleteById(key);
					System.out.println("刪除記錄:Key=" + key + "成功");
				} catch(ProductNotFoundException e) {
					System.out.println("紀錄不存在，無法刪除, Key=" + e.getProductId());
				}
			}
			
		} catch (Exception ex) {
			System.out.println("刪除記錄時發生例外: " + ex.getMessage());
			ex.printStackTrace();
		} 
	}
}