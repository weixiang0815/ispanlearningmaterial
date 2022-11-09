package ch11._05_PC_NG_0;

public class Consumer implements Runnable {
	SharedData sd;

	Consumer(SharedData sd) {
		this.sd = sd;
	}

	public void run() {
		int i;
		System.out.println("C : 消費者開始消費資料...");
		while (true) {
			int j = (int) (Math.random() * 1000);
			System.out.println("C : 消費者即將消費一個資料:");
			if (sd.data == -1) {
				break;
			}
			System.out.println("C : 消費者本次消費的資料: " + (char) sd.data);
			System.out.println("C : 消費者消費資料後，準備休息一段時間:" + j + "毫秒(隨機時間)");
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
			}

		}
		System.out.println("C : 消費者工作結束，因為沒有資料可以消費...");
	}
}
