package ch10._03;

// Custom.java                                                                 
import java.io.*;

public class Custom implements Serializable {

	private static final long serialVersionUID = 1L;

	String language;

	String majorFood;

	public Custom(String language, String majorFood) {
		this.language = language;
		this.majorFood = majorFood;
	}
};
