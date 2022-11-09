
public class Overflow_Underflow {

	public static void main(String[] args) {
		int n = 2147483645;
		System.out.println("n=" + n);
		n++;
		System.out.println("n=" + n);
		n++;
		System.out.println("n=" + n);
		n++;
		System.out.println("n=" + n);
		n++;
		System.out.println("n=" + n);
		
		System.out.println("--------------------");

		int m = -2147483645;
		System.out.println("m=" + m);
		m--;
		System.out.println("m=" + m);
		m--;
		System.out.println("m=" + m);
		m--;
		System.out.println("m=" + m);
		m--;
		System.out.println("m=" + m);
	}

}
