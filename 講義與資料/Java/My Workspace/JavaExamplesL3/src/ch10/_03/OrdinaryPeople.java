package ch10._03;

// Human.java                                                                  
import java.io.*;

class Human implements Serializable {
	String ethnic;
};

// OrdinaryPeople.java                                                         
public class OrdinaryPeople extends Human {
	Custom custom;
	int age;
	String name;
	public OrdinaryPeople(Custom custom, int age, String name, String ethnic) {
		this.custom = custom;
		this.age = age;
		this.name = name;
		this.ethnic = ethnic;
	}
};
