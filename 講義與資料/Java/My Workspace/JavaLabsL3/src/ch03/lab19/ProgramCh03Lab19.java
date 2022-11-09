package ch03.lab19;
// 字串的方法練習 indexOf()與lastIndexOf()
public class ProgramCh03Lab19 {
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        System.out.println("請顯示字串 url 中，第一次出現 com 與最後一次出現 com 的位置(index) ");
        String url = "http://tw.news.yimg.com/comics/comics_whatthehell/2.gif";
        int firstIndex = 0; // 要修改本敘述與下一個敘述
        firstIndex = url.indexOf("com");
        int lastIndex  = 0; 
        lastIndex = url.lastIndexOf("com");
        System.out.println("字串 url，第一次出現 com 的位置(index) 為 " + firstIndex);
        System.out.println("字串 url，最後一次出現 com 的位置(index) 為 " + lastIndex);
    }
}
