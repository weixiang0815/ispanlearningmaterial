package ch03.shortcut;
public class ShortCutDemo1 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//  && : 如果第一個運算元為假，&&的運算結果為假，否則&&的運算結果為第二個運算元
	    System.out.println( "true  &&  true 的結果: " + (true  &&  true ) ) ;
	    System.out.println( "true  &&  false 的結果: " + (true  &&  false ) ) ;
	    System.out.println( "false  &&  true 的結果: " + (false  &&  true ) ) ;
	    System.out.println( "false  &&  false 的結果: " + (false  &&  false ) ) ;
		
     	//  || : 如果第一個運算元為真，||的運算結果為真，否則||的運算結果為第二個運算元
	    System.out.println( "true  ||  true 的結果: " + (true  ||  true ) ) ;
	    System.out.println( "true  ||  false 的結果: " + (true  ||  false ) ) ;
	    System.out.println( "false  ||  true 的結果: " + (false  ||  true ) ) ;
	    System.out.println( "false  ||  false 的結果: " + (false  ||  false ) ) ;
		
	}
}
