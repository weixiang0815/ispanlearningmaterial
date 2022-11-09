package ch07._04_interface;

class Vehicle {
   double  load ;
   double  maxLoad ;
   Vehicle (double maxLoad) {
      this.maxLoad = maxLoad ;
   }
   double  getLoad() {
      return load ;
   }
   boolean addCargo(Weight  w) {
      System.out.println(w.getClass().getName()) ;
      if (load + w.getWeight() > maxLoad)
          return false ;
      else {
          load += w.getWeight() ;
          return true ;
      }
   }
}

class Plane  implements   Weight {
   private int weight = 100000 ;
   public int getWeight() {
      return weight ;
   }
}
class Rock  implements   Weight{
   private int rockWeight = 50000 ;

   public int getWeight() {
      return rockWeight ;
   }
}
class Dog   implements   Weight {
   int dogWeight = 100 ;

   public int getWeight() { 
      return dogWeight ;
   }
}

public class InterfacePractise01 {
   public static void main(String args[]) {
      Plane p1 = new Plane() ;
      Rock  r1 = new Rock() ;
      Dog d1 = new Dog() ;
      Vehicle v = new Vehicle(150000) ; 
      v.addCargo(p1) ;
      v.addCargo(d1) ;
      v.addCargo(r1);
      System.out.println("總重量為" + v.load) ;
   }
}
