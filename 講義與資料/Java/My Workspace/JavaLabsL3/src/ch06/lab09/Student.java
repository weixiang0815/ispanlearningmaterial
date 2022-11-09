package ch06.lab09;

public class Student {
	
	int score;
	
	public void play(int hours) {
		this.score -= hours;
	}
	
	public void study(int hours) {
		this.score += hours;
	}

}
