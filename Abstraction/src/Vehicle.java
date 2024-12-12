
public interface Vehicle {
	public abstract void start();
	void move();
	void stop();

public default void accelerate() {
	System.out.println("Accelerated........");
}
static void breaks() {
	System.out.println("Break applied");
	
}

}

