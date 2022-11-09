package ch07.lab04.solution;

//請更正本程式的錯誤，getFileName為定義在Utility類別(位於同套件)內的非靜態方法
// (為 ch07.lab02 的對照組)

public class ProgramCh07Lab04 {
     public static void main(String[] args) {
         //  解題前先取消本方法的注解
    	 
         String url_1 = "http://www.railway.gov.tw/pic/big_banner_160_172.jpg";
         String url_2 = "http://www.railway.gov.tw";
         String url_3 = "train.gif";
         Utility util = new Utility();
         System.out.println(util.getFileName(url_1));
         System.out.println(util.getFileName(url_2));
         System.out.println(util.getFileName(url_3));
         
     }
}
