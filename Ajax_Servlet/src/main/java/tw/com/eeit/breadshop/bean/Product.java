package tw.com.eeit.breadshop.bean;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private int price;
	private String photo;

	public Product() {
	}

	public Product(String id, String name, int price, String photo) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Product(String name, int price, String photo) {
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Product(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

}
