package ch06.lab06;

/*
// 請去除ReturnType.java與ReturnTypeMain.java內的註解，
// 修改所有的 ???。

// 完成後，請執行ReturnTypeMain.java來測試你的程式碼。
*/
@SuppressWarnings("deprecation")
public class ReturnType {
	
	public byte[] m1() {
	    byte[] b = {1,2,3};
	    return b ; 
	}
	
	public float m2() {
	    return 3.14F ;
	}
	public String m3() {
	    return "如果看到這一行，表示我弄懂何謂傳回值的型態了";
	}
	public Integer m4() {
	    Integer i = new Integer(100);
	    return i;
	}
	public void m5() {
        // 本方法沒有傳回值     
	    return ;
	}
	public Car m6() {
	    Car sportCar = new Car();
	    return sportCar;
	}

}
