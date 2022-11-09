package ch04.lab10;

/*
 * 請編寫程式ch04.lab10.ProgramCh04Lab10，在main()之內能夠印出九九乘法表。
 */
public class ProgramCh04Lab10 {
	public static void main(String[] args) {
		for(byte i = 1; i <= 9; i ++) {
			for(byte j = 1; j <= 9; j ++) {
				System.out.println(i + " × " + j + " = " + (i * j));
			}
		}
		
		
		
	}
}
