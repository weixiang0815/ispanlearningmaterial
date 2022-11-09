package ch12._01_enum._00;

public class SeasonNGMain {

	public static void main(String[] args) {
		int season1 = SeasonNG.SPRING;  
		System.out.println(SeasonNG.getComment(season1)); 
		int season2 = 3;
		System.out.println(SeasonNG.getComment(season2));
		int season3 = 5;
		System.out.println(SeasonNG.getComment(season3));
	}
}
