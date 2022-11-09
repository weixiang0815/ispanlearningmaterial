package ch10._08;

import java.io.File;
import java.io.FilenameFilter;


public class ListFilesDemo {

	public static void main(String[] args) {
		String dir = "C:/JavaShared";
        File folder = new File(dir);
        String[] sa = folder.list();
        for(String s:sa){
        	System.out.println(s);
        }
        System.out.println("-----------------");
        Foo foo = new Foo();
        //Cat kitty = new Cat();
        System.out.println("******************");
        String[] sa3 = folder.list(foo);
        System.out.println("##################");
        for(String s:sa3){
        	System.out.println(s);
        }
	}
}

