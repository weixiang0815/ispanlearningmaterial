package ch06.lab10;

public class Zar {
	
	public long sum(int n) {
		if(n == 1)
			return 1;
		return n + sum(n-1);
	}

}
