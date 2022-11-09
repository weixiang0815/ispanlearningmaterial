package ch10._08;

import java.io.File;
import java.io.FilenameFilter;

//本類別可用來過濾 *.zip之類的檔案
public class SuffixFilter implements FilenameFilter {
	String[] suffix;
	public SuffixFilter(String sx) {
		//傳入的參數可能是 "zip, rar, jar"等副檔名
		//先依照逗號來切割字串
		suffix = sx.split(",");
		//將陣列內的元素全部改成小寫字母
		for (int n = 0; n < suffix.length; n++) {
			suffix[n] = suffix[n].toLowerCase().trim();
		}
	}
	//FilenameFilter介面定義的方法
	public boolean accept(File dir, String name) {
		boolean ok = false;
		name = name.toLowerCase();
		//對於傳入的參數，判斷name是不是用某一個副檔名結尾的?
		for (String str : suffix) {
			if (name.endsWith(str)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
}
