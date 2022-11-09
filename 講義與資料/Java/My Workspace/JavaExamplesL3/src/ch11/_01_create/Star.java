package ch11._01_create;

public class Star extends Thread {
    int num;
    char ch;
    
	public Star(int num, char ch, String name) {
		super(name);
		//this.name = name;
		this.num = num;
		this.ch = ch;
	}

	@Override
	public void run() {
		for(int j=1; j<=num; j++){
			System.out.print("Name=" + getName() );
			for(int i=1; i<=j; i++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
