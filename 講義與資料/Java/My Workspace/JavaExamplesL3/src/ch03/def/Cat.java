package ch03.def;
public  class  Cat {
     public double weight;							// Cat類別的四個屬性
     public int iq;
     String name;
     String address;
      public  Cat(String n, String a, double w) {	// 建構子:必須與類別同名
		name = n;
		address = a;
		weight = w;
	}
     public void eat(int foodWeight) {				// 方法
         weight = weight + foodWeight * 0.1   ;
     }   
     public void study(int hours) {					// 方法
         iq = (int)(iq + hours * 0.1);
     }
}
