import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

// 檔案內碼轉換：可轉換某個資料夾下(及其所有子資料夾內)的特定類型檔案之編碼
public class ChangingTextFileEncoding {
	
	int success = 0 ;
	int fail = 0 ;
	File source;      		//	 此資料夾之下所有檔案都要轉換
	String[] types;			//	 那些檔案要轉碼，副檔名: "java, txt, dat"
	String fromCharset;		//	 原來的編碼
	String toCharset;		//	 新的編碼 

	public ChangingTextFileEncoding(String sourceFolder, String fileType, String fromCharset, String toCharset) {
		this.fromCharset = fromCharset;
		this.toCharset = toCharset;
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
					} else if (checkFileType(pathname.getName())) {
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
				backup(file);
				if (convert(file)) {
					success++;
				} else {
					fail++;
					System.out.println(file + "轉換失敗");
				}
			}
			if (file.isDirectory()){
				traverse(file);
			}
		}
	}
//  檢查檔案類型，看看是否為需要轉碼的檔案
	private boolean checkFileType(String name) {
        boolean target = false;
        for(String ext : types){
        	if (name.toLowerCase().endsWith(ext)) {
        		target = true;
        		break;
        	}
        }
		return target;
	}
	
	// 參數file為要轉碼的檔案
	private boolean convert(File file) {
		String parent = file.getParent();		// 取出file物件的parent(其所屬的資料夾)
		String name = file.getName();			// 取出file物件的名字(不含路徑的名稱)
		File out = new File(parent, name + ".out");   // out: 轉換後的檔案
		File tmp = new File(parent, name);            // tmp: 僅儲存原來完整的路徑檔名，轉換後的檔案要換成此名稱
		
		try(
			FileInputStream fis = new FileInputStream(file);
				// InputStreamReader: 可以指定輸入檔的編碼
			InputStreamReader isr = new InputStreamReader(fis, fromCharset); 
			BufferedReader br = new BufferedReader(isr);
			FileOutputStream fos = new FileOutputStream(out);
				// OutputStreamWriter: 可以指定輸出檔的編碼								
			OutputStreamWriter osw = new OutputStreamWriter(fos, toCharset);
			PrintWriter pw = new PrintWriter(osw);
		) {
			
			String line = "";
			while ((line= br.readLine())!= null){
				pw.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		boolean b1 = file.delete();   		// 刪除原檔案 
		boolean b2 = out.renameTo(tmp);   	// 轉換檔案名稱
		return b1 && b2;
		
	}

	private void backup(File file) {
		String parent = file.getParent();
		String name = file.getName();
		File out = new File(parent, name + ".bak");
		try(
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(out);
		) {
			int len = 0 ;
			byte[] b = new byte[8192];
			while ((len= fis.read(b))!= -1){
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String sourceFolder = "C:\\_java\\eclipse-workspace\\JavaLabsL1\\src";
		String fileType = "java, txt";
		String fromCharset = "BIG5";
		String toCharset = "UTF8";
		ChangingTextFileEncoding cf = 
				new ChangingTextFileEncoding(sourceFolder, fileType, fromCharset, toCharset);
		cf.go();
		System.out.println("轉換完畢, 成功: " + cf.success + ", 失敗: " + cf.fail);
	}
}
