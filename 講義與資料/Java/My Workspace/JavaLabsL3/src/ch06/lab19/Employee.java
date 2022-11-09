package ch06.lab19;

public class Employee {
    private String name;
	public Employee(String name) {
		this.name = name;
	}
	public Employee() {
		this.name = "Noname";
	}
	public String getName() {
		return name;
	}
}
