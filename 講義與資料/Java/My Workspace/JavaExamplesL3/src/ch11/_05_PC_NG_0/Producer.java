package ch11._05_PC_NG_0;

public class Producer implements Runnable {
	SharedData sd;

	Producer(SharedData sd) {
		this.sd = sd;
	}

	String s = "ABCDEFGHIJK";

	public void run() {
		System.out.println("P : 生產者開始生產資料...");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("P : 生產者即將生產一個新的資料:");
			int j = (int) (Math.random() * 1000);
			sd.data = s.charAt(i);
			System.out.println("P : 生產者準備將最新生產的資料放入共用區: " + (char) sd.data);
			System.out.println("P : 生產者生產資料後，準備休息一段時間:" + j + "毫秒(隨機時間)");

			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
			}

		}
		System.out.println("P : 生產者停止生產資料，結束前放置-1來通知消費者已無資料可消費。");
		sd.data = -1;
		System.out.println("P : 生產者工作結束...");
	}
}
