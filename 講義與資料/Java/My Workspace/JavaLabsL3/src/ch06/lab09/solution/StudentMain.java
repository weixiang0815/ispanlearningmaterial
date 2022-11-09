package ch06.lab09.solution;

public class StudentMain {
	public static void main(String[] args) {
		Student tom = new Student();
		System.out.println("湯姆一開始的分數：" + tom.score);
		tom.study(80);
		System.out.println("湯姆現在的分數(1)：" + tom.score);
		tom.play(12);
		System.out.println("湯姆現在的分數(2)：" + tom.score);
	}
}
