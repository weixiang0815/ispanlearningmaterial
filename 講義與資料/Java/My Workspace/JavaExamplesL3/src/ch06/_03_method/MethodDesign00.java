package ch06._03_method;
//  Foo類別有一個方法out，它沒有傳回值，也沒有參數，呼叫它時，它會在螢幕
// 上顯示字串 Hello, World!
public class MethodDesign00 {
   public static void main (String args[]){
       Foo foo = new Foo() ;
       foo.out();
       System.out.println("Program ending");
   }
}
class Foo {
    public void out() {
       System.out.println("Hello, World!");
    }
}
