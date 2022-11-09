package ch06._02_javaVariable;

public class VariablesDemo {
    public static void main(String args[]) {
      // p 與 args 為區域變數
      Piglet p = new Piglet() ;
      p.eat(100) ;
      System.out.println("The weight of Piglet p is " + p.weight ); 
   }
}
class Piglet {
   // growthRatio 為類別變數(又稱靜態變數)
   static public double grouthRatio = 0.35 ; 
   // weight 為實例變數
   double weight ;
   public void eat(int foodWeight) {
   // ratio 與 foodWeight 為區域變數
      double ratio = 0.75 ; 
      weight = weight + foodWeight * ratio ;
   }	
}
