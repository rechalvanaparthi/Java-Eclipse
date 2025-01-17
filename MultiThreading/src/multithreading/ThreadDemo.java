package multithreading;
	
//1.Creating user defined thread using Thread class
class JavaThread extends Thread{

	@Override
	public void run() {
		// define thread job
		for (int i = 1; i <= 10; i++) {
			System.out.println("Java-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

//2.Creating user defined thread using Runnable Interface
class PythonThread implements Runnable {
	@Override
	public void run() {
		// define thread job
		for (int i = 1; i <= 10; i++) {
			System.out.println("Python-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {

		PythonThread p = new PythonThread();
		Thread t = new Thread(p);
		t.start();
		t.join(1000);

		JavaThread j = new JavaThread();
		j.start();// begin thread execution
		// j.run();------->new thread won't be started
		j.join();
		
		// Main thread Job
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
