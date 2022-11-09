package ch09._03_Wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDecimalDemo {
	public static void main(String[] args) {
		double d1 = 143.425;
		double d2 = 2.3875;
	    System.out.println(d1+d2);
	    
	    BigDecimal bd1 = new BigDecimal(d1);
	    BigDecimal bd2 = new BigDecimal(d2);
	    BigDecimal bd3 = bd1.add(bd2);
	    System.out.println(bd3.toString());  // NG
	    bd1 = new BigDecimal(String.valueOf(d1));  // 3.14
	    bd2 = new BigDecimal(String.valueOf(d2));
	    bd3 = bd1.add(bd2);
	    
	    System.out.print(String.valueOf(d1)+"加" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.subtract(bd2);
	    System.out.print(String.valueOf(d1)+"減" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());  
	    
	    bd3 = bd1.multiply(bd2);
	    System.out.print(String.valueOf(d1)+"乘" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    // 	divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
	    //  divide() 的三個參數
	    //  1. BigDecimal divisor: 除數, 
	    //  2. int scale: 小數點後的位數, scale是指『尺、秤等上刻劃的分度』，這分度要多細? 
	    //     每0.1一份? (scale為1)；每0.01一份? (scale為2)；依此類推
	    //  3. RoundingMode roundingMode:  去除多餘數字的模式
	    bd3 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);
	    System.out.print(String.valueOf(d1)+"除" + String.valueOf(d2)+"=");
	    System.out.println(bd3.toString());
	    BigInteger bi = new BigInteger("10000");
	    BigDecimal bd5 = new BigDecimal(bi, 2);
	    System.out.println(bd5);
	    
	}
}
