
public abstract class MyVehicle implements Vehicle1 {
	public void start() {
		System.out.println("Start.....");
	}
	public void move() {
		System.out.println("Move.....");
	}
	public abstract void stop();
	public abstract void noOfWheels();
}
