package ch09._05_Generics._02;

import ch06._09_object.hashCode.Cat;

public class TwoTypesParamMain {
	public static void main(String[] args) {
		Cat kitty= new Cat();
		TwoTypesParam<Integer, Cat> ttp = new TwoTypesParam<>(88, kitty);
		ttp.showTypes();
	}
}
