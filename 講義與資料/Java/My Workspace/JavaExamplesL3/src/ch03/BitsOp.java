package ch03;
public class BitsOp {
public static void main(String[] args) {
         int x = 17;   //  000...00010001      
         int y = 28;//  000...00011100
         System.out.println("x&y=" + (x&y) );
         System.out.println("x|y=" + (x|y) );
         System.out.println("x^y=" + (x^y) );
}
}
/*
int x = 17;   	 //  000...00010001      
int y = 28;	 	 //  000...00011100
                &   000...00010000 ==>16
                |   000...00011101 ==>29
                ^   000...00001101 ==>13
*/
