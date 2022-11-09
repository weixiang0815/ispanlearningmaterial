package ch07.lab10.solution;

// 介面練習步驟二：(本程式可執行)
// 類別 Vehicle 有屬性如下 :
//  load(double)    : 目前的載重
//  maxLoad(double) : Vehicle 所允許的最大載重
// 任何物品要加到 Vehicle 時，必需先檢查目前載重(load)加上
// 物件的重量應該小於 maxLoad, 否則不能加到 Vehicle 內. 
// 現在要將 Plane, Rock, Dog 等類別的物件加到 Vehicle 物件內
//  
// Vehicle 原來有三個方法:
//   boolean addCargo(Dog d), 
//   boolean addCargo(Rock r) 與 
//   boolean addCargo(Plane p) 
// 來執行 Plane, Rock, Dog 等類別的物件加到 Vehicle 的功能:
// 
// 每當加入一個物件時, 必須判斷加入後的總載重是否小於允許的
// 最大總載重(maxLoad)
// 
// 現在請以 interface 的方式來簡化 Vehicle 的程式設計
// 假設 interface Weight 如下:

 interface Weight {
    int getWeight() ;
 }  


class Vehicle {
  double  load ;
  double  maxLoad ; 
  Vehicle (double maxLoad) {
    this.maxLoad = maxLoad ; 
  }
  double  getLoad() {
    return load ;
  }  
  // 請完成此方法
  
  boolean addCargo(Weight  w ) {
	    if (load + w.getWeight() > maxLoad) 
	          return false ;
	    else {
	       	  load += w.getWeight() ; 
	       	  return true ;
	    }	  
  }
  
  // 下列三個方法必須被替換。
  /*
  boolean addCargo(Dog d) {
      if (load + d.dogWeight > maxLoad) 
          return false ;
      else {
       	  load += d.dogWeight ; 
       	  return true ;
      }	  
   }
   boolean addCargo(Rock r) {
      if (load + r.rockWeight > maxLoad) 
          return false ;
       else {
       	  load += r.rockWeight ; 
       	  return true ;
       }	  
   }
   boolean addCargo(Plane p) {
      if (load + p.weight > maxLoad) 
          return false ;
       else {
       	  load += p.weight ; 
       	  return true ;
       }	  
   }
   */
}
class Plane implements Weight {
	int weight = 100000;
	public int getWeight() {
		return weight;
	}
}

class Rock implements Weight {
	int rockWeight = 50000;
	public int getWeight() {
		return rockWeight;
	}
}

class Dog implements Weight {
	int dogWeight = 100;
	public int getWeight() {
		return dogWeight;
	}
}

public class ProgramCh07Lab10 {
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
