package ch09._05_Generics._01;

public class ErrorGen01 {
	public static void main(String[] args) {
		G<Foo> gf = new G<Foo>();
		G<Car> gb = new G<Car>();
		//gb = gf;   // NG
		//gf = gb;   // NG
	}
}
class Foo extends Car {}
class Car {}
class G<T>{}
