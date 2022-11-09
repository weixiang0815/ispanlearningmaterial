package ch07.lab05;

//執行本程式時，螢幕會顯示: 固定的初值。
//請利用靜態區塊修改程式StaticVariable.java，讓它的comment屬性
//有變動的初值:
//早上執行本程式時初值為:『現在是上午』
//下午執行本程式時初值為:『現在是下午』
//
//提示：下列Java程式片段可以決定執行程式時是上午或下午
/*
Calendar c = Calendar.getInstance();
if (c.get(Calendar.AM_PM) == Calendar.AM) {
	System.out.println("現在是上午");
} else {
	System.out.println("現在是下午");
}	
 */
public class ProgramCh07Lab05 {
     public static void main(String[] args) {
         System.out.println(StaticVariable.comment);
     }
}
