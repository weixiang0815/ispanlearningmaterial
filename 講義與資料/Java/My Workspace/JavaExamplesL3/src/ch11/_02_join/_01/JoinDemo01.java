package ch11._02_join._01;

public class JoinDemo01 {
	static public void main(String args[]) {
		Foo ob1 = new Foo(1, 20000);
		Foo ob2 = new Foo( 20001, 40000);
		Foo ob3 = new Foo( 40001, 60000);
		Thread t1 = new Thread(ob1, "t1");
		Thread t2 = new Thread(ob2, "t2");
		Thread t3 = new Thread(ob3, "t3");
		t1.start();
		t2.start();
		t3.start();

		System.out.println("執行緒 t1 是否活著? " + t1.isAlive());
		System.out.println("執行緒 t2 是否活著? " + t2.isAlive());
		System.out.println("執行緒 t3 是否活著? " + t3.isAlive());

		try {
			System.out.println("Waiting for threads to finish.");
			Thread t = Thread.currentThread();
            System.out.println("該執行執行緒的name=" + t.getName());
			System.out.println("111");
			// main執行緒要等t1所對應執行緒做完它的run()方法才能做下一敘述，
			// 否則main執行緒必須等待t1所對應執行緒做完它的run()方法。			
			t1.join();  
			System.out.println("222");
			// main執行緒要等t2所對應執行緒做完它的run()方法才能做下一敘述，
			// 否則main執行緒必須等待t2所對應執行緒做完它的run()方法。
			t2.join();
			System.out.println("333");
			// main執行緒要等t3所對應執行緒做完它的run()方法才能做下一敘述，
			// 否則main執行緒必須等待t3所對應執行緒做完它的run()方法。
			t3.join();
			System.out.println("444");

		} catch (InterruptedException e) {
			System.out.println("Main thread 中斷.");
		}

		long total = ob1.sum + ob2.sum + ob3.sum;
		System.out.println("三個執行緒的計算總和 : " + total);

		System.out.println("\n\n執行緒 t1 是否活著? " + t1.isAlive());
		System.out.println("執行緒 t2 是否活著? " + t2.isAlive());
		System.out.println("執行緒 t3 是否活著? " + t3.isAlive());
	}
}
