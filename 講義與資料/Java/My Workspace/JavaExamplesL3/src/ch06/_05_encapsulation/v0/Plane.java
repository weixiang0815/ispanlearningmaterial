package ch06._05_encapsulation.v0;

//封裝練習 -- Approach 1 
//類別Plane有屬性如下 :
//	    cargoLoad(double)    : 目前的載重(單位為 Kg)
//	    allowMaxLoad(double) : Plane 所允許的最大載重(單位為 Kg)
//
//任何物品要加到Plane時，必需先檢查目前載重(cargoLoad)加上
//物件的重量應該小於allowMaxLoad,否則不能加到Plane內.
//
//當Plane的屬性沒有任何存取控制而外界可以任意讀寫時,
//load將因不能存放合理的數值以致無法發生功用.
public class Plane {
	public double cargoLoad; //
	public double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = allowMaxLoad;
	}
	public void showCurrentLoad() {
		System.out.println("目前載重:" + cargoLoad + "公斤, " 
	         + (cargoLoad > allowMaxLoad ? "已超載，危險" :  "未超載，安全" ));
	}	
}
