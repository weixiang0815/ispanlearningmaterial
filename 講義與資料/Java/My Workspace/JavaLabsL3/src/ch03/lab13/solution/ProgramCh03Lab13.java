package ch03.lab13.solution;

/*
 新建程式ch03.lab13.ProgramCh03Lab13.java，內含main() 方法。
 在main()方法之內
 1.定義一個整數變數totalSalary初值為100000，
 2.定義一個整數變數temp初值為0，
 3.totalSalary變數加上(+)50000後，再將結果存入(=)變數temp內，
 4.將temp變數的值存入totalSalary變數內，
 5.定義一個整數變數employeeCount初值為 5，它是用來存放一個公司的員工數，
 6.定義一個整數變數avg初值為0，它是用來存放平均薪資，
 7.計算平均薪資：將totalSalary變數除以(除號用/來表示) employeeCount變數的值，再將結果存入(=) avg變數內，
 8.使用System.out.println()在螢幕上印出變數totalSalary、employeeCount、avg的內含值。
 */

public class ProgramCh03Lab13 {
	public static void main(String[] args) {
		// 1.定義一個整數變數totalSalary初值為100000，
		int totalSalary = 100000;
		// 2.定義一個整數變數temp初值為0，
		int temp = 0;
		// 3.totalSalary變數加上(+)50000後，再將結果存入(=)變數temp內，
		temp = totalSalary + 50000;
		// 4.將temp變數的值存入totalSalary變數內，
		totalSalary = temp;
		// 5.定義一個整數變數employeeCount初值為 5，它是用來存放一個公司的員工數，
		int employeeCount = 5;
		// 6.定義一個整數變數avg初值為0，它是用來存放平均薪資，
		int avg = 0;
		// 7. 計算平均薪資：將totalSalary變數除以(除號用/來表示) employeeCount變數的值，再將結果存入(=) avg變數內，
		avg = totalSalary / employeeCount;
		// 8.使用System.out.println()在螢幕上印出變數totalSalary、employeeCount、avg的內含值。
		System.out.println("totalSalary=" + totalSalary);
		System.out.println("employeeCount=" + employeeCount);
		System.out.println("avg=" + avg);
	}
}
