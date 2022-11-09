package ch06._05_encapsulation.v1;

// 封裝練習 -- Approach 2 
// 修改本程式, 讓外界無法直接存取cargoLoad與allowMaxLoad，
// 如此一來外界就無法未經控管的情況下, 直接修改這些變數的內含值
//
// 另外, 本程式提供public boolean addCargo(double load)給外界
// 使用, 當外界需要將貨物加入Plane時, 外界便呼叫此方法.
// 該方法會進行檢查, 即目前載重(cargoLoad)加上物件的重量應該小
// 於allowMaxLoad, 否則不能加到Plane內. 

public class Plane {
	private double cargoLoad; //
	private double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = allowMaxLoad;
	}
	public boolean addCargo(double load) {
		if (this.cargoLoad + load <= this.allowMaxLoad) {
			this.cargoLoad = this.cargoLoad + load;
			return true;
		} else {
			return false;
		}
	}
	public double getLoad() {
		return cargoLoad;
	}
	public void showCurrentLoad() {
		System.out.println("目前載重:" + cargoLoad + "公斤, "
				+ (cargoLoad > allowMaxLoad ? "已超載，危險" : "未超載，安全"));
	}
}
