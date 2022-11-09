package ch12._01_enum._02;

public class SeasonProMain {
	public static void main(String[] args) {
		SeasonPro season1 = SeasonPro.WINTER;  
		//System.out.println(season1.getComment()); 
		System.out.println(season1);
		SeasonPro season2 = SeasonPro.AUTUMN;;
		System.out.println(season2);
		SeasonPro s100 = SeasonPro.WINTER;;
		System.out.println(s100);
		//SeasonPro season3 = 5;  // Error
		//System.out.println(season3);
	}	
}
