package ch04.lab01.solution;

//練習目的：了解區域變數的有效範圍
//為了能正確的印出變數i，請更正本程式的錯誤

public class ProgramCh04Lab01 {
 public static void main(String[] args) {
     int sum = 10;
     int i = 100;
     {
         
         sum += i;
     }
     System.out.println("sum=" + sum + ", i=" + i);
 }
}
