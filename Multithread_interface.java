class Work implements Runnable {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Laps: " + i);
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Multithread_interface {
    public static void main(String[] args) {
        Work w = new Work();

        // Create a thread using the Runnable object
        Thread T1 = new Thread(w);
        T1.start();

        // Main thread execution
        for (int i = 1; i < 13; i++) {
            System.out.println("HeadCount: " + i);
            try {
                Thread.sleep(500); // Pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}