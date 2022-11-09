package ch06._01_usingObject;

public class RefVariableAssignmentMain {
	public static void main(String args[]) {
		Box myBox = new Box();
		myBox.width = 10;
		myBox.height = 5;
		myBox.depth = 3;
		System.out.println("myBox 的體積=" + myBox.getVolume());
		System.out.println("myBox 的長=" + myBox.width);
		System.out.println("myBox 的高=" + myBox.height);
		System.out.println("========================");
        //透過這兩個變數操作的物件是同一個物件(因為兩個變數指向同一個物件)
		Box yourBox = myBox;
		yourBox.width = 100;
		System.out.println("myBox 的體積=" + myBox.getVolume());
		System.out.println("myBox 的長=" + myBox.width);
		System.out.println("myBox 的高=" + myBox.height);;
	}
}
