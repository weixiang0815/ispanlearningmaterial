package ch06._03_method.rv2;

public class ReturnTypeDemo {
	public int m1() {
	    //…
	    return (int)(Math.random()*42) + 1 ; 
	}
	public double m2() {
	    //…
	    return Math.random() ;
	}
	public String m3() {
	    //…
	    return "Hello World";
	}
	public int[] m4() {
	    //…
	    int[] a = {1, 2, 3};
	    return a;
	}
	public void m5() {
	    //…
	    
	    return ;
	}
	public Cat m6() {
	    //…
	    Cat kitty = new Cat();
	    return kitty;
	}
}
