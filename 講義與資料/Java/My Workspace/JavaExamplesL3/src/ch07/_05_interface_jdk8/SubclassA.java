package ch07._05_interface_jdk8;

public class SubclassA implements InterfaceJDK8, In_JDK8_2 {
	public void defaultMethod(){
		System.out.println("如果由兩個介面繼承兩個相同簽名的方法,");
		System.out.println("子類別就一定要Override此方法");
	}
	@Override
	public void m1() {

	}
	public static void staticMethod(){
		System.out.println("這是SubclassA的靜態方法");
	}
}
