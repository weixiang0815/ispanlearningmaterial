package ch04.if_stmt;

public class IfElseIfDemo {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 130);
		System.out.println("分數=" + score);
		if (score >= 60 && score <= 100) {
			System.out.println("萬歲");
			System.out.println("萬歲");
			System.out.println("萬歲");
		} else if (score >= 50 && score <= 59) {
			System.out.println("活當");
		} else if (score >= 0 && score <= 49) {
			System.out.println("死當");
		} else {
			System.out.println("分數錯誤");
		}
	}
}
