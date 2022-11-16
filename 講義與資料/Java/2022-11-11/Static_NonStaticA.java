
public class Static_NonStaticA {
	int n = 100;
	static int s = 1;
	public static void main(String[] args) {
		s++;
		s1();
		Static_NonStaticA obj = new Static_NonStaticA();
		obj.n++;
		obj.ns();
	}
	
	public static void s1() {
		Static_NonStaticA obj2 = new Static_NonStaticA();
		s++;
		obj2.n++;
		obj2.ns();
	}
	
	public void ns() {
		
	}
}
