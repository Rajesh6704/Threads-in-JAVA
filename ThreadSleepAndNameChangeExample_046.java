public class ThreadSleepAndNameChangeExample_046 {
    public static void main(String[] args) {
        Thread myThread_046 = new Thread(new MyRunnable_046());

        myThread_046.start();

        try {
            for (int i = 5; i >= 1; i--) {
                Thread.sleep(1000); // Sleep for 1 second
                myThread_046.setName("Thread_" + i + "_046");
                System.out.println("Thread name changed to: " + myThread_046.getName());
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class MyRunnable_046 implements Runnable {
    @Override
    public void run() {
        String threadName_046 = Thread.currentThread().getName();
        System.out.println("Initial thread name: " + threadName_046);

        try {
            Thread.sleep(1000); // Sleep for 1 second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
