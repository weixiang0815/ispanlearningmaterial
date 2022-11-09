package ch09._08_comparable;

public class Student implements Comparable<Student> {
	int studentID = 0;
	String name;
	int chi = 0;
	int eng = 0;
	int math = 0;

	public Student(int studentID, String name, int chi, int eng, int math) {
		this.studentID = studentID;
		this.name = name;
		this.chi = chi;
		this.eng = eng;
		this.math = math;
	}

	public int studentID() {
		return studentID;
	}

	public int compareTo1(Student o) {
		if (studentID == o.studentID)
			return 0;
		else if (studentID > o.studentID)
			return -1;
		else
			return 1;
//		 return (studentID - o.studentID);
	}

	public int compareTo(Student o) {
		int totalScore = chi + eng + math;
		int otherTotalScore = o.chi + o.eng + o.math;
		return (totalScore - otherTotalScore);
		
//		if (totalScore == otherTotalScore)
//			if (math == o.math) {
//				return 0;
//			} else if (math > o.math) {
//				return -1;
//			} else {
//				return 1;
//			}
//		else if (totalScore > otherTotalScore)
//			return -1;
//		else
//			return 1;
		
	}

	public String toString() {
		int totalScore = chi + eng + math;
		return "學號:" + studentID + "  姓名:" + name + "  總分:" + totalScore
				+ "  國文:" + chi + "  數學:" + math + "  英文:" + eng;
	}
}
