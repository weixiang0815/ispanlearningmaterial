package ch10._08;

import java.io.File;
import java.io.FilenameFilter;


public class Foo implements FilenameFilter{

	
	public boolean accept(File dir, String name) {
		if (name.endsWith("zip")) {
           System.out.println("&&&&&&&&&&   dir=" + dir + ", name=" + name);
		   return true;
		} else {
		   return false;
		}
	}
}
