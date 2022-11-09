package ch09._05_Generics._01;

public class Gen<T> {
	private T data;

	public Gen(T data) {
		this.data = data;
	}
	public Gen() {
	}
	public T getData() {
		return data;
	}
	public void showType() {
		System.out.println("data的形態為:" + data.getClass().getName());
	}
	public void showData() {
		System.out.println("內儲資料為:" + data);
	}
}
