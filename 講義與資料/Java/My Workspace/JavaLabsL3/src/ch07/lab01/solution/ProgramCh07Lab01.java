package ch07.lab01.solution;
// 請更正本程式的錯誤，VAT為定義在Utility類別內的靜態成員
public class ProgramCh07Lab01 {
     public static void main(String[] args) {
         //  解題前先取消本方法的注解
    	 double price = 300 ; 
    	 double totalPriceTaxed = price * (1 + Utility.VAT); 
    	 System.out.println("總金額:" + totalPriceTaxed);
     }
}


