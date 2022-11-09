package ch09._08_comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ComparableDemo0 {
	
	public static void main(String[] args) {
		Student s1 = new Student(101, "張鈞亞", 95, 90, 80);
		Student s2 = new Student(100, "溫家寶", 90, 95, 80);
		Student s3 = new Student(102, "小彬彬", 99, 90, 76);
		Student s4 = new Student(201, "迷你彬", 95, 91, 60);
		Student s5 = new Student(601, "全智賢", 75, 80, 60);
		Student s6 = new Student(210, "金三順", 75, 70, 70);
	    List<Student> ts = new ArrayList<Student>();
	    ts.add(s1);ts.add(s2);ts.add(s3);
	    ts.add(s4);ts.add(s5);ts.add(s6);
	    Collections.sort(ts);
	    for(Student s:ts){
	    	System.out.println(s);
	    }
	}
}
