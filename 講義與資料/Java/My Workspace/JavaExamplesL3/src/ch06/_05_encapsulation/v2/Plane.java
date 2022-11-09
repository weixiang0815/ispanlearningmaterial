package ch06._05_encapsulation.v2;

//封裝練習 -- Approach 3 
//由於屬性cargoLoad與allowMaxLoad因為某種原因, 其單位必須由Kg改為
//Newton, 因此屬性內含值會隨之變動, 為了不影響外界的使用者
//本程式將仍然接受以Kg為單位的輸入值與仍然產生以Kg為單位的輸出值.
//
//因此, 本程式提供 private double kgToNewton(double w) 與
//private double newtonToKg(double w) 兩個方法, 來進行單位
//的轉換 

public class Plane {
	private double cargoLoad; 
	private double allowMaxLoad;

	public Plane(double allowMaxLoad) {
		this.allowMaxLoad = kgToNewton(allowMaxLoad);
	}

	public boolean addCargo(double cargoLoad) {
		if (this.cargoLoad + kgToNewton(cargoLoad) <= this.allowMaxLoad) {
			this.cargoLoad = this.cargoLoad + kgToNewton(cargoLoad);
			return true;
		} else {
			return false;
		}
	}
	public double getCargoLoad() {
		return newtonToKg(cargoLoad);
	}

	public void showCurrentLoad() {
		System.out.println("目前載重:" + newtonToKg(cargoLoad) + "公斤, "
				+ (cargoLoad > allowMaxLoad ? "已超載，危險" : "未超載，安全"));
	}	

	double getCargoLoadInNewton() {
		return cargoLoad;
	}

	private double kgToNewton(double w) {
		return 9.8 * w;
	}

	private double newtonToKg(double w) {
		return w / 9.8;
	}
}
