package ch12._01_enum._00;
// 本範例的目的在說明使用整數常數來代表少量可能值(如春夏秋冬)的風險
// 本範例並未使用列舉
public class SeasonNG {
	public final static int SPRING = 1;
	public final static int SUMMER = 2;
	public final static int AUTUMN = 3;
	public final static int WINTER = 4;
	public static String getComment(int season) {
		String comment = "?????";
		switch(season) {
		   case SPRING : 
			   comment = "春光明媚";
			   break;
		   case SUMMER : 
			   comment = "炎炎夏日";
			   break;
		   case AUTUMN : 
			   comment = "秋高氣爽";
			   break;
		   case WINTER : 
			   comment = "天寒地凍";
			   break;
		}
		return comment;
	}
}
