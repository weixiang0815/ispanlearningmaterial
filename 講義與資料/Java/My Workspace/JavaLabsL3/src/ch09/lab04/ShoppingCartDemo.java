package ch09.lab04;

// Collection 類別練習(add(), iterator()...) 
// 
// ShoppingCartDemo.java
// ShoppingCart 為一 Collection 物件, 現在要將 Hat, Shirt, 
// Shoes 等類別的物件加到 ShoppingCart 物件內, 每個類別都含有
// 貨品編號, 數量, 單價等屬性. ShoppingCart 有一方法(getTotalPrice())
// 能計算其內所含之貨品的總金額, 請修改此程式, 使其能以多形的方式
// 來簡化 getTotalPrice() 的設計
//
// 提示:必須為 Hat, Shirt, Shoes 設計一個共同父類別或實作同一個介面

import java.util.*;

class ShoppingCart {
	@SuppressWarnings("rawtypes")
	private Vector v = new Vector();
	private double totalPrice = 0;

	@SuppressWarnings("unchecked")
	public void addProduct(Object o) {
		v.add(o);
	}

	// 這個方法有缺點，請利用多形來加以改善
	@SuppressWarnings("rawtypes")
	public double getTotalPrice() {
		Iterator it = v.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Hat) {
				Hat h = (Hat) o;
				totalPrice += h.unitPrice * h.amount;
			} else if (o instanceof Shirt) {
				Shirt h = (Shirt) o;
				totalPrice += h.p * h.a;
			} else if (o instanceof Shoes) {
				Shoes h = (Shoes) o;
				totalPrice += h.price * h.amt;
			}
		}
		return totalPrice;
	}
	// public void removeProduct(Object o) { }
}

public class ShoppingCartDemo {
	public static void main(String args[]) {
		ShoppingCart sc = new ShoppingCart();
		Hat h1 = new Hat("H001", 350, 1);
		Shirt st1 = new Shirt("ST01", 200, 2);
		Shoes sh1 = new Shoes("SH01", 100, 2);

		sc.addProduct(h1);
		sc.addProduct(st1);
		sc.addProduct(sh1);
		System.out.println(sc.getTotalPrice());
	}
}

class Hat {
	String code;
	double unitPrice;
	int amount;

	Hat(String code, double unitPrice, int amount) {
		this.code = code;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}
}

class Shirt {
	String prodCode;
	double p;
	int a;

	Shirt(String prodCode, double p, int a) {
		this.prodCode = prodCode;
		this.p = p;
		this.a = a;
	}
}

class Shoes {
	String pCode;
	double price;
	int amt;

	Shoes(String pCode, double price, int amt) {
		this.pCode = pCode;
		this.price = price;
		this.amt = amt;
	}
}
