package ch06._04_constructor.oc;

public class OverloadConstructor {
	public static void main(String[] args) throws Exception {
		String s0 = new String(); // 建立空字串
		System.out.println("s0="+s0);
		
		char[] c0 = {'張', '軍', '亞'};
		// 利用字元陣列c0的內容，來建立字串物件
	    String s1 = new String(c0); 
	    System.out.println("s1="+s1);
	    
	    // 利用字串物件s1，來建立新的字串物件s2
	    String s2 = new String(s1); 
	    System.out.println("s2="+s2);
	    
	    // 建立一個位元組陣列ba
		byte[] ba = {(byte)0xB1, (byte)0x69, (byte)0xAD, (byte)0xB8};
	    // 利用位元組陣列內的元素來建立新的字串物件s3，位元組陣列的元素會依
		// 本機預設編碼(Big5)來解讀，選取適當的元素個數來轉換為Unicode字元
		// 再將這些字元組成一個字串。
		// 『張』的Big5編碼為0xB1, 0x69, 『飛』的Big5編碼為0xAD, 0xB8
		String s3 = new String(ba); 
		System.out.println("s3="+s3);
		
	    // 建立一個位元組陣列bx
		byte[] bx = {(byte)0xE9,(byte)0x97, (byte)0x9C, (byte)0xE5, (byte)0x85, (byte)0xAC};
	    // 利用位元組陣列內的元素來建立新的字串物件s4，位元組陣列的元素會依
		// 指定的編碼來解讀，選取適當的元素個數來轉換為Unicode字元
		// 再將這些字元組成一個字串。
		// 『關』的UTF-8編碼為0xE9, 0x97, 0x9C, 『公』的UTF-8編碼為0xE5, 0x85, 0xAC
		String s4 = new String(bx, "UTF-8"); 
		System.out.println("s4="+s4);
	}
}
