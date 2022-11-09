package ch07.lab02;
//請更正本程式的錯誤
public class ProgramCh07Lab02 {
	public static void main(String[] args) {
		// 解題前先取消本方法的注解
		String url_1 = "http://www.railway.gov.tw/pic/big_banner_160_172.jpg";
		String url_2 = "http://www.railway.gov.tw";
		String url_3 = "train.gif";
		System.out.println(getFileName(url_1));
		System.out.println(getFileName(url_2));
		System.out.println(getFileName(url_3));
	}

	public static String getFileName(String string) {
		return "執行時如果看到此訊息，表示錯誤";
	}
}
