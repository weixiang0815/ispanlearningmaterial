package EEIT157_14_王威翔_第三章作業;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println(5 + 5);
		// 兩個5皆為整數型態，故程式判斷為5+5=10
		
		System.out.println(5 + '5');
		// 程式判斷優先將字元型態轉變為整數型態，故先將字元'5'轉變為整數53，再計算5+53=58
		
		System.out.println(5 + "5");
		// 程式判斷優先將整數型態轉變為字串型態，故先將整數5轉變為字串"5"，再將兩字串相加"5"+"5"="55"

	}

}
