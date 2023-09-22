public class ThreadNameChangeExample_046 {
    public static void main(String[] args) {
        // Create a thread
        Thread myThread_046 = new Thread(new MyRunnable_046());

        // Start the thread
        myThread_046.start();

        try {
            // Sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Change the thread's name
        myThread_046.setName("NewThreadName_046");

        // Check the updated thread name
        System.out.println("Updated thread name: " + myThread_046.getName());
    }
}

class MyRunnable_046 implements Runnable {
    @Override
    public void run() {
        // Get the initial thread name
        String threadName_046 = Thread.currentThread().getName();
        System.out.println("Initial thread name: " + threadName_046);

        try {
            // Sleep for 2 seconds
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Get the updated thread name
        threadName_046 = Thread.currentThread().getName();
        System.out.println("Thread name after sleep: " + threadName_046);
    }
}
