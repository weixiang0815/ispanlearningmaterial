package ch06._04_constructor.thisInCtor2;
public  class  EmployeeOC  { 
   String name ;
   int  age  ;
   EmployeeOC(String name, int age) {
      this.name = name ;
      this.age =  age ;
   }
   EmployeeOC(String name) {
      this.name = name ;
   }
   EmployeeOC() {
      this.name = "測試用" ;
   }
   public void printData() {
      System.out.println("Name=" + name) ;
      System.out.println("Age="  + age) ;
   }
//   public static void main(String args[]) {
//      EmployeeOC tom = new EmployeeOC("Tom", 45) ;
//      tom.printData() ;
//   }
}
