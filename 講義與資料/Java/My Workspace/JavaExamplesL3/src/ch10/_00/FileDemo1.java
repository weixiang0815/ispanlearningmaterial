package ch10._00;

import java.io.File;
import java.io.IOException;

//本程式應該執行兩三次，觀察不同情況下所產生的的訊息
public class FileDemo1 {	
	public static void main(String[] args) throws IOException {
	    File f1 = new File("c:\\Kitty");  
	    System.out.println(f1 + "是否為目錄:" + f1.isDirectory());
	    System.out.println(f1 + "是否為檔案:" + f1.isFile());
	    System.out.println(f1 + "是否存在　:" + f1.exists());
	    // 可以新建c:\\Kitty目錄(f1.mkdir())或
	    // 新建一個空的檔案(f1.createNewFile())
	    
	    // 下面兩個敘述二選一
        System.out.println("新建目錄" + f1 + "是否成功:" + f1.mkdir());
        //System.out.println("新建檔案" + f1 + ":" + f1.createNewFile());
        System.out.println("-----------------------------------");
        
        // 假設dir為目錄
        File dir = new File("d:\\log\\marketing");
        // 如果dir不存在
        if (!dir.exists()){
            // 如果dir不存在 ，新建dir目錄(注意方法為:dir.mkdirs();)
        	dir.mkdirs();
        } else {
        	System.out.println(dir + "已經存在");
        }
        File f2 = new File(dir, "log.txt");
        System.out.println(f2 + "是否存在　:" + f2.exists());
        
        if (!f2.exists()){
           //在File物件dir所指定的目錄下，新建一個檔案
           System.out.println("新建檔案" + f2 + ":" + f2.createNewFile());
        } else {
           System.out.println("檔案" + f2 + " 已經存在無法新建");
           System.out.println(f2 + "是否為隱藏檔　:" + f2.isHidden());
        }
        System.out.println(f2 + "檔案的大小:" + f2.length());
	}
}
