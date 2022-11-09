package ch10._08;

import java.io.File;
import java.io.FilenameFilter;


public class FooV2 implements FilenameFilter{
	String []  sa;
	public FooV2(String[] sa){
		this.sa = sa;
	}
	public FooV2(String types){  // types ===> rar, zip, jar
		sa = types.split(",");
		for(int n=0; n< sa.length; n++){
			sa[n] = sa[n].toLowerCase().trim();
		}
	}
	
	public boolean accept(File dir, String name) {
		for(String ext : sa){
			if (name.toLowerCase().endsWith(ext)){
				return true;
			}
		}
		return false;

	}
}
