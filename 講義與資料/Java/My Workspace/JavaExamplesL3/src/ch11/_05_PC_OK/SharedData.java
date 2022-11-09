package ch11._05_PC_OK;
public class SharedData {
	private int data;
	private boolean available = false;
	synchronized public void setData(int i) {
		// 生產者執行的方法
		System.out.println("P1");
		while (available == true) {   
			try {
				System.out.println("P2: 由於消費者尚未取走上次生產的資料，因此生產者無法繼續工作，必須等待。");
				this.wait();
				System.out.println("P3: 生產者被喚起。");
			} catch (InterruptedException e) {
			}
		}
		System.out.println("P4: 生產者準備將最新生產的資料放入共用區: " + ( i != -1 ?   (char) i : "-1, 表示已經沒有資料可以消費") );
		data = i;
		available = true;
		System.out.println("P5");		
		this.notify();
		System.out.println("P6: 生產者準備返回...");
	}
	synchronized public int getData() {
		// 消費者執行的方法
		System.out.println("C1");
		while (available == false) {
			try {
				System.out.println("C2: 由於生產者尚未生產最新的資料，因此消費者無法繼續工作，必須等待。");
				this.wait();
				System.out.println("C3: 消費者被喚起。");
			} catch (InterruptedException e) {
			}
		}
		System.out.println("C4");
		available = false;
		System.out.println("C5");
		this.notify();
		System.out.println("C6: 消費者準備返回...");
		return data;
	}	
}
