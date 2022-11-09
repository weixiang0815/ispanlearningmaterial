package ch11._04_synchronization.v1;
class SharedSavingAccount {
	int balance;
	boolean withdraw(int amount) {
		boolean result = false;
		
			if (balance > amount) {
				try {
					result = true;
					int tmp = balance - amount;
					Thread.sleep(10);
					balance = tmp;
				} catch (InterruptedException e) {
				}
			} else {
				result = false;
			}
		
		return result;
	}
	void deposit(int amount) {
		int i = balance + amount;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
		balance = i;
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
class HusbandAndWifeErrorVersion01 {
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
