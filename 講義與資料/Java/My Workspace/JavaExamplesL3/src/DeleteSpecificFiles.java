import java.io.File;
import java.io.FileFilter;

// 刪除特定副檔名的檔案
public class DeleteSpecificFiles {
	
	int success = 0 ;
	int fail = 0 ;
	File source;      		//	 此資料夾之下之特定檔案都要刪除
	String[] types;			//	 那些檔案要轉碼，副檔名: "bak"
	

	public DeleteSpecificFiles(String sourceFolder, String fileType) {
		source = new File(sourceFolder);
		types = fileType.split(",");
		for(int n=0; n < types.length; n++){
			types[n] = types[n].toLowerCase().trim(); 
		}
	}

    public void go(){
    	traverse(source);
    }
    // 
	public void traverse(File folder) {
		File[] entries = folder.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.isDirectory()) {
						return true;
					} else if (checkFileExtension(pathname.getName())) {
						return true;
					} else {
						return false;
					}
				}

			});
		if (entries == null) {
			return;
		}
		for(File file : entries){
			if (file.isFile()){
				if (file.delete()) {
					success++;
				} else {
					fail++;
					System.out.println(file + "刪除失敗");
				}
			}
			if (file.isDirectory()){
				traverse(file);
			}
		}
	}
	//  檢查檔案類型，看看是否為需要轉碼的檔案
	private boolean checkFileExtension(String name) {
        boolean qualified = false;
        for(String ext : types){
        	if (name.toLowerCase().endsWith(ext)) {
        		qualified = true;
        		break;
        	}
        }
		return qualified;
	}
	
	public static void main(String[] args) {
		String sourceFolder = "C:\\_java\\eclipse-workspace\\JavaLabsL1\\src";
		String fileType = "bak";
		DeleteSpecificFiles cf = 
				new DeleteSpecificFiles(sourceFolder, fileType);
		cf.go();
		System.out.println("刪除完畢, 成功: " + cf.success + ", 失敗: " + cf.fail);
	}
}
