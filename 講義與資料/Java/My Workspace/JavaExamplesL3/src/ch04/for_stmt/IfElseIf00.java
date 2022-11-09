package ch04.for_stmt;

public class IfElseIf00 {
	public static void main(String[] args) {
		int ctr90_100 = 0, ctr80_89 = 0, ctr70_79 = 0, ctr60_69 = 0, ctr1_59 = 0;
		int score = 0;
		for (int x = 0; x < 20; x++) {
			score = (int) (Math.random() * 100 + 1);
			System.out.println("score =" + score);
			if (score >= 90 && score <= 100)
				ctr90_100++;
			else if (score >= 80 && score <= 89)
				ctr80_89++;
			else if (score >= 70 && score <= 79)
				ctr70_79++;
			else if (score >= 60 && score <= 69)
				ctr60_69++;
			else if (score >= 1 && score <= 59)
				ctr1_59++;
		}
		System.out.println("介於 100 與 90 之間共有 " + ctr90_100 + " 個 ");
		System.out.println("介於  89 與 80 之間共有 " + ctr80_89 + " 個 ");
		System.out.println("介於  79 與 70 之間共有 " + ctr70_79 + " 個 ");
		System.out.println("介於  69 與 60 之間共有 " + ctr60_69 + " 個 ");
		System.out.println("介於  59 與  1 之間共有 " + ctr1_59 + " 個 ");
	}
}
