package multithreading;

class BhahubaliThread extends Thread{
	int total = 0;
	
	@Override
	public void run() {
		System.out.println("2.BahubaliThread begins calculation");
		for(int i=1;i<=100;i++) {
			total +=i;
		}
		System.out.println("3.BahubaliThread gives notification");
		synchronized(this) {
		this.notify();
		}
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		BhahubaliThread b = new BhahubaliThread();
		b.start();
		
		//b.join();
		//Thread.sleep(1);
		
		
		//main thread
		System.out.println("1.Main thread calls wait()");
		synchronized(b) {
		b.wait();
		}
		System.out.println("4.Main thread calls access total property");
		System.out.println(b.total);
	}
}