package ch07.lab03.solution;

// 請更正本程式的錯誤，VAT為定義在Utility類別內的非靜態成員
// (為 ch07.lab01 的對照組)
public class ProgramCh07Lab03 {
     public static void main(String[] args) {
         //	  解題前先取消本方法的注解
         double price = 300 ; 
         Utility util = new Utility();
         double totalPriceTaxed = price * (1 + util.VAT);
         System.out.println("總金額:" + totalPriceTaxed);
     }
}
