class MyThread_046 extends Thread {
    public MyThread_046(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running, Iteration: " + i);
            try {
                Thread.sleep(100); // Simulate some work
            } catch (InterruptedException e) {
                // No need to interrupt the thread here
            }
        }
    }
}

public class ThreadPriorityExample_046 {
    public static void main(String[] args) {
        MyThread_046 thread1_046 = new MyThread_046("Process_1_046");
        MyThread_046 thread2_046 = new MyThread_046("Process_2_046");
        MyThread_046 thread3_046 = new MyThread_046("Process_3_046");
        MyThread_046 thread4_046 = new MyThread_046("Process_4_046");
        MyThread_046 thread5_046 = new MyThread_046("Process_5_046");

        // Set priorities for the threads
        thread1_046.setPriority(Thread.MIN_PRIORITY);    // Priority 1
        thread2_046.setPriority(Thread.NORM_PRIORITY);   // Priority 5 (default)
        thread3_046.setPriority(Thread.NORM_PRIORITY);   // Priority 5 (default)
        thread4_046.setPriority(Thread.MAX_PRIORITY - 1); // Priority 9
        thread5_046.setPriority(Thread.MAX_PRIORITY);     // Priority 10

        // Start the threads
        thread1_046.start();
        thread2_046.start();
        thread3_046.start();
        thread4_046.start();
        thread5_046.start();
    }
}
