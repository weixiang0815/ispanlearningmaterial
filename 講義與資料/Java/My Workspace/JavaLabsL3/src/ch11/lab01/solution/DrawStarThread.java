package ch11.lab01.solution;

public class DrawStarThread extends Thread {
	int num;
	char symbol;
	public DrawStarThread(int num, char symbol) {
		this.num = num;
		this.symbol = symbol;
	}
	public void run() {
		for(int n=1; n <= num; n++){
			for(int x=1; x <= n; x++){
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
