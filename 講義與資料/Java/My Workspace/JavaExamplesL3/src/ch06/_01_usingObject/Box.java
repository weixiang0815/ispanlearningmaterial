package ch06._01_usingObject;

//modifiers class classname
public class Box {

	// 變數型態 變數名稱 = 初值 ;
	int width;
	int depth;
	int height;

	// 傳回值的型態 方法名稱(參數列) {
	// type local-variable1 ;
	// type local-variable2 ;
	// statements ;
	// }
	public double getSurfaceArea() {
		return 2 * (width * depth + depth * height + width * height);
	}
	public double getVolume() {
		return width * depth * height;
	}
}
