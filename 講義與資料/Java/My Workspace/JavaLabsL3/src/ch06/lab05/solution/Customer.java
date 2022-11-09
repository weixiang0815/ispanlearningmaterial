package ch06.lab05.solution;
/*
 * 請於套件ch06.lab05內，編寫程式Customer.java，
 * 該程式定義 Customer 類別，含有五個屬性與一個方法，
 * 五個屬性如下： 
1. customerID (int) : 含有初值 12345
2. name (String)  : 含有初值 張大明
3. address (String) : 含有初值 台中市大明街581巷415號
4. phoneNumber (String) : 含有初值 0936666666
5. emailAddress (String) :含有初值 mmm@sss.com.tw  
請完成該類別的方法:
   public void displayInformation() 
     此方法會以下列的方式在螢幕上顯示 Customer 的基本資料:
     客戶編號:xxxxxxxx 
     客戶姓名:xxxxxx
     客戶地址:XXXXXXXXXXXXXXXXXXXXXXXX
     電話:xxxxxxxxxxxxxxx
     email:xxxxxxxxxxxxxxxxxxxxxxxx

 */
public class Customer {
	int customerID = 12345;
	String name = "張大明";
	String address = "台中市大明街581巷415號";
	String phoneNumber = "0936666666";
	String emailAddress = "mmm@sss.com.tw";
	public void displayInformation() {
	    System.out.println("客戶編號:" + customerID);	
	    System.out.println("客戶姓名:" + name);
	    System.out.println("客戶地址:" + address);
	    System.out.println("電話:" + phoneNumber);
	    System.out.println("email:" + emailAddress);
	}	
}
