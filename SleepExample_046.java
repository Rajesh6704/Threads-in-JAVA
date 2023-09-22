class MyThread_046 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(10); // Sleep for 10 milliseconds
            System.out.println("Thread_046 slept for 10 milliseconds.");
            Thread.sleep(20); // Sleep for 20 milliseconds
            System.out.println("Thread_046 slept for 20 milliseconds.");
            Thread.sleep(50); // Sleep for 50 milliseconds
            System.out.println("Thread_046 slept for 50 milliseconds.");
            Thread.sleep(70); // Sleep for 70 milliseconds
            System.out.println("Thread_046 slept for 70 milliseconds.");
            Thread.sleep(100); // Sleep for 100 milliseconds
            System.out.println("Thread_046 slept for 100 milliseconds.");
        } catch (InterruptedException e) {
            // No need to interrupt the thread here
        }
    }
}

public class SleepExample_046 {
    public static void main(String[] args) {
        MyThread_046 myThread_046 = new MyThread_046();
        myThread_046.start();
    }
}
