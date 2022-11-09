package ch08.lab03.solution;
// 去掉19, 20列的注解後，編譯下面程式時，第19, 20列會產生錯誤，
// 現在想要在第 14 列使用『宣告法』來處理該方法所產生的例外，
// 請修改第14列，使得本程式能夠編譯, 並能夠執行。
import java.io.* ;
import java.net.* ;

public class ProgramCh08Lab03 {
   public static void main(String[] args)   {
   
       System.out.println("Program ends") ;

   }        
   @SuppressWarnings("unused")
static void methodA() throws IOException {
       int no = 0 ; 
       if ( no != 0) {
          int i = 3 / no ;
       } 
       URL urlA = new URL("http://www.seed.net.tw") ;
       FileInputStream fis = new FileInputStream("c:\\Test.txt") ;
       fis.close();
    }	
} 
