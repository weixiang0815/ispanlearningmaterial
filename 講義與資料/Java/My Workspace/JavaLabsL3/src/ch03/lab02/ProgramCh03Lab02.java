package ch03.lab02;

import java.util.Iterator;

// 練習目的：練習加法運算，請算出 
// 1 + 3 + 5 + 7 + 9 的總和  

public class ProgramCh03Lab02 {
    public static void main(String[] args) {
    	int n = 0;
    	for(int i = 1; i <= 9 ; i += 2) {
    		n += i;
    	}
    	System.out.println("n = " + n);
    	
    }
}
