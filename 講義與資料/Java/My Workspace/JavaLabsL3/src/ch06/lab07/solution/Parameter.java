package ch06.lab07.solution;
/*
// Parameter.java有一個方法getCapitalGain()有三個參數
// 1. int     principal     本金
// 2. double  rate  利率
// 3. int     period  		期數
// 傳回值為double型態的本金與利息的總和，請設計本方法的參數
// 
// Math.pow(x, y) 會傳回 x的y次方
// 完成後，請執行ParameterMain.java來測試你的程式碼。
*/
public class Parameter {
	//此方法計算本利和
	public double getCapitalGain(int principal, double rate, int period) {
	    double gain = 0 ;

	    gain = principal * Math.pow(1 + rate, period);
	    return gain ; 
	}
}
