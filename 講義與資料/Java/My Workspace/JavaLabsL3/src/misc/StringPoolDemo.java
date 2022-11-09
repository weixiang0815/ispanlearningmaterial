package misc;

public class StringPoolDemo {
	public static void main(String[] args) {
	   String s1 = "abc";  // 字串池 String Pool
	   String s2 = "abc";  
	   String s3 = "ab" + "c";
	   
	   String t1 = new String("abc");
	   String t2 = new String("abc");
	   
	   
	   System.out.println("s1==s2 ? " + (s1==s2));
	   System.out.println("s3==s2 ? " + (s3==s2));
	   System.out.println("s1.equals(s2) ? " + s1.equals(s2));
	   System.out.println("---------------------------");
	   System.out.println("s1==t1 ? " + (s1==t1)) ;
	   System.out.println("t2==t1 ? " + (t2==t1)) ;
	   System.out.println("s1.equals(t1) ? " + s1.equals(t1));
	  
	}
}
