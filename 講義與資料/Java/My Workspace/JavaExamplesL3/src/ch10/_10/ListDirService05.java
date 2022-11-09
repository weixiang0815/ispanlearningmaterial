package ch10._10;
import java.io.File;
import java.io.FilenameFilter;
public class ListDirService05 {
	private File dir ;			//要顯示內容的資料夾
	private String fileTypes;	//檔案類型
	String[] suffix;
	//建構子一：接受兩個參數
	// 1. dir:要顯示的資料夾，型別為File
	// 2. fileType:要顯示的檔案類型
	public ListDirService05(File dir, String fileTypes){
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
	public ListDirService05(String dir, String fileTypes){
		this(new File(dir), fileTypes);
	}
	// 此方法內有匿名者類別
	// 匿名者類別的重點:
	// 1. 直接new介面或new抽象類別或new任何需要被Override某個方法的父類別
	// 2. 產生物件時，才定義類別
	public void showDirectoryContent(){
		String[] ld01 = dir.list(new FilenameFilter(){			
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
		});
		for (String s:ld01){
			System.out.println(s);
		}
	}
	/* ************** 已經註解 *********************
	public class SuffixFilter implements FilenameFilter {
		String[] suffix;

		public SuffixFilter(String suffix) {
			String[] tmp = suffix.split(",");
			for (int n = 0; n < tmp.length; n++) {
				tmp[n] = tmp[n].toLowerCase().trim();
			}
			this.suffix = tmp;
		}
		@Override
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
    // ************** 已經註解 *********************
	*/
	public static void main(String[] args) {
		ListDirService05 ld04 = new ListDirService05("D:\\", "jar, txt");
		ld04.showDirectoryContent();
	}
}
