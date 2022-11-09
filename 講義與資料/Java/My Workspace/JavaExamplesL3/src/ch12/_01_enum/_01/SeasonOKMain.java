package ch12._01_enum._01;

public class SeasonOKMain {
	public static void main(String[] args) {
		SeasonOK season1 = SeasonOK.SPRING;  
		System.out.println(getComment(season1)); 
		SeasonOK season2 = SeasonOK.AUTUMN;;
		System.out.println(getComment(season2));
		//SeasonOK season3 = 5;  // Error
		//System.out.println(.getComment(season3));
	}
	public static String getComment(SeasonOK sEnum){
		String comment = "?????";
//		switch(sEnum) {
//		   case SPRING : 
//			   comment = "春光明媚";
//			   break;
//		   case SUMMER : 
//			   comment = "炎炎夏日";
//			   break;
//		   case AUTUMN : 
//			   comment = "秋高氣爽";
//			   break;
//		   case WINTER : 
//			   comment = "天寒地凍";
//			   break;
//		}
		return comment;
	}
}
