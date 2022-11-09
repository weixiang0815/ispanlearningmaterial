package ch07.lab08;

// 本程式要加總一組屬於Rectangle、Triangle、Circle類別之物件的面積, 
// 它們都繼承自Shape類別。執行之後, 發現有些類別的面積並不正確(為零) 
// 請利用abstract類別/方法的優點來改正本程式


// 步驟一: 將Shape類別的getArea()方法修改為abstract方法。
class Shape {
   double getArea() {
      return  0 ;
   }
}

// 步驟二: 編譯本程式就可發現問題之所在。

class Rectangle extends Shape  {
   double a, b ; 
   Rectangle(double a, double b) {
     this.a = a ;
     this.b = b ;
   }	
   double getarea() {  
     return a * b ;
   }
}

class Triangle extends Shape  {
   double a, h ;
   Triangle(double a, double h) {
      this.a = a ;
      this.h = h ;
   }	
   double getARea() {  
     return 0.5 * a * h ;
   }   
}

class Circle  extends Shape {
   double radius ; 
   Circle(double r) {
      radius = r ;
   }	
   double cirArea() {
      return Math.PI * radius * radius ;
  }	
}
// main program 
public class ProgramCh07Lab08 {
   public static void main(String args[]) {
      Rectangle r = new Rectangle(10, 20) ;
      Triangle t = new Triangle(5, 3) ;
      Circle  c = new Circle(10) ;
      System.out.println("圓面積    = " + r.getArea() ) ;
      System.out.println("三角形面積= " + t.getArea() ) ;
      System.out.println("長方形面積= " + c.getArea() ) ;
      double totalArea = r.getArea() + 
                         t.getArea() + 
                         c.getArea() ;
                        
      System.out.println("總面積為:" + totalArea ) ;
      System.out.println("總面積為:" + Math.round(totalArea * 100) / 100.0 ) ;  // 四捨五入
   }
}
