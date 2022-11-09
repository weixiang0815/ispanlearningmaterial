package ch10._07;
import java.io.File;
public class ListDirService01 {
	private File dir ;   //要顯示內容的資料夾
	//建構子一：接收File型別的物件
	public ListDirService01(File dir){
		this.dir = dir;
	}
	//建構子二：接收String型別的物件
	public ListDirService01(String dir){
		this.dir = new File(dir);
	}
	//顯示資料夾的內容，全部都顯示，沒有過濾。
	public void showDirectoryContent(){
		String[] ld01 = dir.list();
		for (String s:ld01){
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		String path = "D:\\";
		ListDirService01 ld = new ListDirService01(path);
		System.out.println(path+ "之下的內容:");
		ld.showDirectoryContent();
	}
}
