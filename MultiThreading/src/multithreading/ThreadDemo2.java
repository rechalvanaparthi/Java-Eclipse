package multithreading;

class RedThread extends Thread{
	public void run() {
		System.out.println("Red");
	}
}
class YellowThread extends Thread{
	public void run() {
		System.out.println("Yellow");
	}
}
class GreenThread extends Thread{
	public void run() {
		System.out.println("Green");
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {
		RedThread r = new RedThread();
		r.start();
		YellowThread y = new YellowThread();
		y.start();
		GreenThread g = new GreenThread();
		g.start();
	}
}
