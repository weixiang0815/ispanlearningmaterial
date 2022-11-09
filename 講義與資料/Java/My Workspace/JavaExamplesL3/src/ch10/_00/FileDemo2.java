package ch10._00;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {	
	public static void main(String[] args) throws IOException {
        File dir = new File("C:\\", "Program Files");
        System.out.println(dir + "是否存在　:" + dir.exists());
        System.out.println(dir + "是否為目錄:" + dir.isDirectory());
        System.out.println(dir + "是否為絕對路徑:" + dir.isAbsolute());
        //如果該File物件為一個資料夾，則傳回值不具意義。
        System.out.println(dir + "檔案的大小:" + dir.length());
        System.out.println(dir + "檔案的路徑:" + dir.getPath());
        System.out.println(dir + "檔案的絕對路徑:" + dir.getAbsolutePath());
        System.out.println(dir + "檔案的標準路徑:" + dir.getCanonicalPath());
        System.out.println("-----------------------------------");
        dir = new File("C:\\", ".\\..\\Program Files");
        System.out.println(dir + "是否存在　:" + dir.exists());
        System.out.println(dir + "是否為目錄:" + dir.isDirectory());
        System.out.println(dir + "是否為絕對路徑:" + dir.isAbsolute());
        //如果該File物件為一個資料夾，則傳回值不具意義。
        System.out.println(dir + "檔案的大小:" + dir.length());
        System.out.println(dir + "檔案的路徑:" + dir.getPath());
        System.out.println(dir + "檔案的絕對路徑:" + dir.getAbsolutePath());
        System.out.println(dir + "檔案的標準路徑:" + dir.getCanonicalPath());
        System.out.println("-----------------------------------");        
        System.out.println("在Java程式中，所有的相對路徑都是相對於System.getProperty(\"user.dir\")");
        System.out.println(System.getProperty("user.dir"));       
        System.out.println("-----------------------------------");
        File f3 = new File("pictures", "./cartoon/micky.gif");
        // 如果f3不存在
        if (!f3.exists()){
            // 如果f3不存在 ，新建f3檔案
        	dir.createNewFile();
        } 
        System.out.println(f3 + "是否為目錄:" + f3.isDirectory());
	    System.out.println(f3 + "是否為檔案:" + f3.isFile());
	    System.out.println(f3 + "是否存在　:" + f3.exists());
	    System.out.println(f3 + "檔案的名稱:" + f3.getName());
	    System.out.println(f3 + "檔案的父目錄名稱:" + f3.getParent());
	    System.out.println(f3 + "檔案的路徑:" + f3.getPath());        
        System.out.println(f3 + "檔案的絕對路徑:" + f3.getAbsolutePath());
        System.out.println(f3 + "檔案的標準路徑:" + f3.getCanonicalPath());
        System.out.println("-----------------------------------");
	}
}
