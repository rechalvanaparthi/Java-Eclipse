//we cannot create object using partially implemented class
public class Test {
	public static void main(String[] args) {
	//MyVehicle v = new MyVehicle();
		
		Bike1 b = new Bike1();
		b.start();
		b.move();
		b.stop();
		b.noOfWheels();
		System.out.println("           ");
		
		Car1 c = new Car1();
		c.start();
		c.move();
		c.stop();
		c.noOfWheels();
		
		
		
}
}
