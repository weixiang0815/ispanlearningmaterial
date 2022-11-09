package EEIT157_14_王威翔_第三章作業;

public class Ex2 {

	public static void main(String[] args) {
		int time = 256559, sec, min, hour, day;
		sec = time % 60;
		time /= 60;
		min = time % 60;
		time /= 60;
		hour = time % 24;
		day = time / 24;
		System.out.println("256559秒為" + day + "天" + hour + "小時" + min + "分" + sec + "秒");
		
	}

}
