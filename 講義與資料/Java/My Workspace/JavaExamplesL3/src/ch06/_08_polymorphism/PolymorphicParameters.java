package ch06._08_polymorphism;

class Vet { 
   void vaccinate (Mammal m){
      m.cry() ;                  		// 直接執行Mammal家族的共有方法，不必型別轉換                                     
      if ( m instanceof Dog) {  		// 如果存放在變數m之內的物件為Dog類別或其子類別之物件
          Dog d = (Dog)m ;       		// 將變數m內的物件參考轉存到Dog型態的變數d內
          d.bark() ;             		// 透過變數d執行Dog類別獨有的方法bark()
      } else if ( m instanceof Cat) { 	// 如果存放在變數m之內的物件為Cat家族類別之物件
	      Cat c = (Cat)m ;              // 將變數m內的物件參考轉存到Cat型態的變數c內
	      c.sleep() ;                   // 透過變數c執行Cat類別獨有的方法sleep() 
     }
   }
}
class Mammal {
   void cry() {
      System.out.println("???") ;
   }
}
class Dog extends Mammal {
   // Dog  members
   void cry() {
     System.out.println("Dog:WouWouuu...") ;
   }
   void bark() {
     System.out.println("Dog:WannWannWaannn...") ;
   }
}
class Cat extends Mammal  {
   void cry() {
      System.out.println("Cat:Maeo...") ;
   }
   void sleep() {
      System.out.println("Cat:zzzZZZ...") ;
   }
}
class Kitty extends Cat  {
   void cry() {
      System.out.println("Kitty:Maeo...") ;
   }
   void sleep() {
     System.out.println("Kitty:zzzZZZ...") ;
   }
}
public class PolymorphicParameters {
   public static void main(String args[]) {
      Vet  doctor      = new Vet() ;
      Mammal  snoopy   = new Dog() ;
      Mammal  garfield   = new Cat() ;
      doctor.vaccinate(snoopy) ;
      doctor.vaccinate(garfield) ;
      Mammal kitty = new Kitty() ;
      doctor.vaccinate (kitty) ;
   }
}
