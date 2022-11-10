package romanToInteger;

import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String roman = s.next();
		s.close();
		System.out.println(romanToInt(roman));

	}
    static public int romanToInt(String s) {
    	int[] value = {1000, 500, 100, 50, 10, 5, 1};
    	int[] num = new int[s.length()];
    	for(int i = 0; i < num.length; i ++) {
    		switch(s.charAt(i)) {
    		case 'M':
    			num[i] = value[0];
    			break;
    		case 'D':
    			num[i] = value[1];
    			break;
    		case 'C':
    			num[i] = value[2];
    			break;
    		case 'L':
    			num[i] = value[3];
    			break;
    		case 'X':
    			num[i] = value[4];
    			break;
    		case 'V':
    			num[i] = value[5];
    			break;
    		case 'I':
				num[i] = value[6];
    			break;
    		}
    	}
    	int integer = 0;
    	for(int i = 0; i < num.length; i ++) {
    		if(i != num.length - 1) {
    			if(i != num.length - 1 & num[i] < num[i + 1]) {
    				integer += num[i + 1] - num[i];
    				i ++;
    				continue;
    			}
    		}
    		integer += num[i];
    	}
    	return integer;
    }
}
