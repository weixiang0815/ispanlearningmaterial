package ch09._05_Generics._02;

public class TwoTypesParam<T, S> {
	private T ob1;
	private S ob2;
	public TwoTypesParam(T ob1, S ob2) {
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	public T getOb1() {
		return ob1;
	}
	public void setOb1(T ob1) {
		this.ob1 = ob1;
	}
	public S getOb2() {
		return ob2;
	}
	public void setOb2(S ob2) {
		this.ob2 = ob2;
	}
	public void showTypes() {
		System.out.println("兩個型態參數的形態為:" + 
        ob1.getClass().getName() + "與" +  ob2.getClass().getName()  );
	}
}
