package ch04.lab10.solution;

/*
 * 請編寫程式ch04.lab10.ProgramCh04Lab10，在main()之內能夠印出九九乘法表。
 */
public class ProgramCh04Lab10 {
	public static void main(String[] args) {
		for (int n = 1; n <= 9; n++) {
			for (int w = 1; w <= 9; w++) {
				System.out.println(n + " X " + w + " = " + n*w);
			}
		}
	}
}
