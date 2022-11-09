package ch11._05_PC_OK;

public class Producer implements Runnable {
	SharedData sd;
	String s = "ABCDEFGHIJK";
	Producer(SharedData sd) {
		this.sd = sd;
	}
	public void run() {
		System.out.println("P : 生產者開始生產資料...");
		for (int i = 0; i < s.length(); i++) {
			System.out.println("P : 生產者即將生產一個新的資料:");
			int j = (int) (Math.random() * 1000);
			sd.setData(s.charAt(i));
			System.out.println(
			"P : 生產者生產資料後，準備休息一段時間:" + j + "毫秒(隨機時間)");
			try {
				Thread.sleep(j);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("P : 生產者停止生產資料，結束前放置-1來通知消費者已無資料可消費。");
		sd.setData(-1);
		System.out.println("P : 生產者工作結束...");
	}
}
