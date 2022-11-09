package ch06.lab09.solution;

public class Student {
	int score;
	public void play(int hours) {
		score -= hours;
	}
	public void study(int hours) {
		score += hours;
	}
}
