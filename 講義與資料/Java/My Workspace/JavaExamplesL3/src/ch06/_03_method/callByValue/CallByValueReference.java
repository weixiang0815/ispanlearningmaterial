package ch06._03_method.callByValue;
class SwapTwoIntegerRef {
	void swap(Data d) {
		int temp;
		temp = d.i;
		d.i = d.j;
		d.j = temp;
		System.out.println("swap()已將屬性i與j的值交換, i=" + d.i + ", j=" + d.j);
	}
}
public class CallByValueReference {
	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		Data data = new Data();
		data.i = i;
		data.j = j;
		SwapTwoIntegerRef cbv = new SwapTwoIntegerRef();
		System.out.println("呼叫swap()方法前, i=" + data.i + ", j =" + data.j);
		cbv.swap(data);
		System.out.println("呼叫swap()方法後, i=" + data.i + ", j =" + data.j);
	}
}
