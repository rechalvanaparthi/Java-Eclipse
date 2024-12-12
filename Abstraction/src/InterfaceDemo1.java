
public class InterfaceDemo1 {
public static void main(String[] args) {
	Vehicle bike = new Bike();
	bike.start();
	bike.move();
	bike.stop();
	bike.accelerate();
	System.out.println(".........");
	
	Vehicle car = new Car();
	car.start();
	car.move();
	car.stop();
	System.out.println(".........");
	
	Vehicle bus = new Bus();
	bus.start();
	bus.move();
	bus.stop();
	bus.accelerate();
	Vehicle.breaks();
	
	
	
}
}
