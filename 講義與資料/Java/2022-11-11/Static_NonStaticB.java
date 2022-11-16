
public class Static_NonStaticB {
	int n = 100;
	static int s = 1;
	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);		
		Static_NonStaticB sn2 = new Static_NonStaticB();
		sn2.n++;
		sn2.ns();
	}
	
	public static void s1() {
		
		System.out.println("s1()");
	}
	
	public void ns() {
		ns2();
		s1();
		n++;
		s++;
	}
	
	public void ns2() {
		System.out.println("ns1()");
	}
}
