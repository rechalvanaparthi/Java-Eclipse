package multithreading;

// 1. Creating user-defined thread using Runnable interface
class RedRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Red");
    }
}

class YellowRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Yellow");
    }
}

class GreenRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Green");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        // Create thread instances by passing Runnable objects
        RedRunnable redRunnable = new RedRunnable();
        Thread redThread = new Thread(redRunnable);
        redThread.start(); // Start Red thread
        
        YellowRunnable yellowRunnable = new YellowRunnable();
        Thread yellowThread = new Thread(yellowRunnable);
        yellowThread.start(); // Start Yellow thread
        
        GreenRunnable greenRunnable = new GreenRunnable();
        Thread greenThread = new Thread(greenRunnable);
        greenThread.start(); // Start Green thread
        
        // Optional: Wait for all threads to finish before main thread continues
        redThread.join();
        yellowThread.join();
        greenThread.join();
    }
}

