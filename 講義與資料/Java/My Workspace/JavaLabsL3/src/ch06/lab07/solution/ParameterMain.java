package ch06.lab07.solution;
/*
//請去除Parameter.java與ParameterMain.java內的註解，
//修改所有的 ???。

//完成後，請執行ParameterMain.java來測試你的程式碼。
*/
public class ParameterMain {
	public static void main(String[] args) {
		Parameter rt = new Parameter();
		double ans = rt.getCapitalGain(10000, 0.02, 20);
		System.out.println("10000元，利率為2%,存20年的本利和=" + ans);
	}
}
