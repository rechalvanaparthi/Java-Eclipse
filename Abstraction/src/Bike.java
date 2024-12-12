
public class Bike implements Vehicle {
	public void start() {
		System.out.println("Bike Started");
	}
	public void move() {
		System.out.println("Bike Moved");
	}
	public void stop() {
		System.out.println("Bike Stopped");
	}
	@Override
	public void accelerate(){
		System.out.println(". . . ");
	}

}
