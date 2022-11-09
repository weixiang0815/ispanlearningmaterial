package ch10._09;

import java.io.File;
import java.io.FilenameFilter;

public class ListDirService03 {
	private File dir ;			//要顯示內容的資料夾
	private String fileTypes;	//檔案類型
	//建構子一：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為File
	// 2. fileType:要顯示的檔案類型
	public ListDirService03(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
	}
	//建構子二：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為String
	// 2. fileType:要顯示的檔案類型
	public ListDirService03(String dir, String fileTypes){
		this.dir = new File(dir);
		this.fileTypes = fileTypes;
	}
	public void showDirectoryContent(){
		SuffixFilter sf = new SuffixFilter();
		String[] ld01 = dir.list(sf);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	//SuffixFilter為內部類別。請注意，在此類別內直接使用外部類別的
	//fileTypes屬性
	public class SuffixFilter implements FilenameFilter {
		String[] suffix;
		public SuffixFilter() {
			suffix = fileTypes.split(",");
			for (int n = 0; n < suffix.length; n++) {
				suffix[n] = suffix[n].toLowerCase().trim();
			}
		}
		
		public boolean accept(File dir, String name) {
			boolean ok = false;
			name = name.toLowerCase();
			for (String str : suffix) {
				if (name.endsWith(str)) {
					ok = true;
					break;
				}
			}
			return ok;
		}
	}	
	public static void main(String[] args) {
		ListDirService03 ld03 = new ListDirService03("D:\\", "zip, gif");
		ld03.showDirectoryContent();
	}
}
