public class MultiThreadExample_046 {
    public static void main(String[] args) {
        // User-defined thread
        Thread userThread_046 = new MyThread_046();
        // Main method's thread
        Thread mainThread_046 = Thread.currentThread();
        
        // Start the user-defined thread
        userThread_046.start();
        
        try {
            // Sleep for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            mainThread_046.interrupt();
        }
        
        System.out.println("Main method's thread_046: Done sleeping for 1 second.");
        
        try {
            // Wait for the user thread to finish
            userThread_046.join();
        } catch (InterruptedException e) {
            mainThread_046.interrupt();
        }
        
        System.out.println("User-defined thread_046: Done sleeping for 1 second.");
    }
}

class MyThread_046 extends Thread {
    @Override
    public void run() {
        try {
            // Sleep for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("User-defined thread_046: Done sleeping for 1 second.");
    }
}
