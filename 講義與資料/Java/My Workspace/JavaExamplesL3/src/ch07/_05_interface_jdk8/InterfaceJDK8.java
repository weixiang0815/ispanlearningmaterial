package ch07._05_interface_jdk8;

public interface InterfaceJDK8 extends IParent {
	int n = 100;
	public static void staticMethod(){
		System.out.println("這是介面InterfaceJDK8的靜態方法");
	}
	default void defaultMethod(){
		System.out.println("這是介面InterfaceJDK8的Default方法");
	}
    public void m1(); 
}
