package ch06.lab19;
/*
1. ch06.lab19套件內有三個類別: Employee類別、Manager類別與President類別，
        其中Manager為Employee的子類別， President為Manager的子類別。
        
2. 請修改Manager類別與President類別，替這兩個類別分別加上一個能夠接受字串參數
        的建構子，這個參數將成為此物件之name屬性的屬性值。
        
3. 取消Main類別內的註解，測試你的程式。
*/
public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("John");
		System.out.println("emp的名字=" + emp.getName());
		Manager man = new Manager();
		System.out.println("man的名字=" + man.getName());
		President pre = new President();
		System.out.println("pre的名字=" + pre.getName());
		
//		Manager man1 = new Manager("Jack");
//		System.out.println("man1的名字=" + man1.getName());
//		President pre1 = new President("Marie");
//		System.out.println("pre1的名字=" + pre1.getName());

	}
}
