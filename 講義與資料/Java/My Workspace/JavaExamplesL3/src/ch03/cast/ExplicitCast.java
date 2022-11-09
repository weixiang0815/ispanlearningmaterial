package ch03.cast;

public class ExplicitCast {
	@SuppressWarnings("unused")
	public static void main(String agrs[]) {
		short s = 200;
		s = (short) (s + 1); // int型別的資料轉換為short型別�臧G

		byte b = 100;
		b = (byte) (b + 1);   // int型別的資料轉換為byte型別�臧G

		int i = 100;
		i = i + 1;
		// double型別的資料轉換為float型別�臧G
		float area0 = (float) (30 * 30 * 3.14);

		double area1 = 30 * 30 * 3.14;
	}
}
