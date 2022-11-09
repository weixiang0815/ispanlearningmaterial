package ch11._04_synchronization.v2;
class SharedSavingAccount {
	int balance;
	boolean withdraw(int amount) {
		boolean result = false;
		synchronized (this) {
			if (balance > amount) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ignore) {
				}
				result = true;
				balance -= amount;
			} else {
				result = false;
			}
		}
		return result;
	}
}
class Husband extends Thread {
	int moneyWithdrawn = 0;
	SharedSavingAccount sa;
	Husband(SharedSavingAccount sa) {
		this.sa = sa;
	}
	public void run() {
		if (sa.withdraw(5000))
			moneyWithdrawn = 5000;
	}
}
class Wife extends Thread {
	int moneyWithdrawn = 0;
	SharedSavingAccount sa;
	Wife(SharedSavingAccount sa) {
		this.sa = sa;
	}
	public void run() {
		if (sa.withdraw(5000))
			moneyWithdrawn = 5000;
	}
}
class HusbandAndWife {
	public static void main(String[] args) {
		SharedSavingAccount sd = new SharedSavingAccount();
		sd.balance = 10015;
		Husband h = new Husband(sd);
		Wife w = new Wife(sd);
		h.start();
		w.start();
		try {
			w.join();
			h.join();

		} catch (InterruptedException e) {
		}
		System.out.println("The final balance is = " + sd.balance);
		System.out.println("The husband withdrawal is = " + h.moneyWithdrawn);
		System.out.println("The wife withdrawal is = " + w.moneyWithdrawn);
		System.out.println("The total withdrawal is = "
				+ (h.moneyWithdrawn + w.moneyWithdrawn));
	}
}
