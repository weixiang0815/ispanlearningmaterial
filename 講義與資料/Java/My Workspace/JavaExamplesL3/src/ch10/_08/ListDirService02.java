package ch10._08;

import java.io.File;

public class ListDirService02 {
	private File dir ;  		//要顯示內容的資料夾
	private String fileTypes;	//檔案類型
	//建構子一：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為File
	// 2. fileType:要顯示的檔案類型
	public ListDirService02(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
	}
	//建構子二：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為String
	// 2. fileType:要顯示的檔案類型
	public ListDirService02(String dir, String fileTypes){
		this.dir = new File(dir);
		this.fileTypes = fileTypes;
	}

	public void showDirectoryContent(){
		//建構SuffixFilter類別的物件
		SuffixFilter sf = new SuffixFilter(fileTypes);
		String[] ld01 = dir.list(sf);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		ListDirService02 ld02 = new ListDirService02("D:\\", "zip, txt");
		ld02.showDirectoryContent();
	}
}
