package ch10._10;
import java.io.File;
import java.io.FilenameFilter;
public class ListDirService04 {
	private File dir ;			//要顯示內容的資料夾
	private String fileTypes;	//檔案類型
	String[] suffix;
	//建構子一：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為File
	// 2. fileType:要顯示的檔案類型
	public ListDirService04(File dir, String fileTypes){
		this.dir = dir;
		this.fileTypes = fileTypes;
		suffix = fileTypes.split(",");
		for (int n = 0; n < suffix.length; n++) {
			suffix[n] = suffix[n].toLowerCase().trim();
		}
	}
	//建構子二：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為String
	// 2. fileType:要顯示的檔案類型	
	public ListDirService04(String dir, String fileTypes){
		this(new File(dir), fileTypes);
	}
	// 採用 Lambda Expression
	// 
	public void showDirectoryContent(){
		String[] ld01 = dir.list(			
			(File dir, String name)-> {
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
		);
		for (String s:ld01){
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		ListDirService05 ld05 = new ListDirService05("D:\\", "gif, html");
		ld05.showDirectoryContent();
	}
}
