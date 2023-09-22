import java.util.concurrent.Semaphore;

class Printer_046 {
    private Semaphore semaphore_046;

    public Printer_046(int maxJobs_046) {
        semaphore_046 = new Semaphore(maxJobs_046, true); // True indicates a fair semaphore.
    }

    public void print(String job_046, int jobId_046) {
        try {
            semaphore_046.acquire(); // Acquire a permit (or wait if no permit is available)
            System.out.println("Job " + jobId_046 + " started printing: " + job_046);
            Thread.sleep(1000); // Simulate printing time
            System.out.println("Job " + jobId_046 + " completed printing: " + job_046);
            semaphore_046.release(); // Release the permit
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class PrintJob_046 implements Runnable {
    private Printer_046 printer_046;
    private String job_046;
    private int jobId_046;

    public PrintJob_046(Printer_046 printer_046, String job_046, int jobId_046) {
        this.printer_046 = printer_046;
        this.job_046 = job_046;
        this.jobId_046 = jobId_046;
    }

    @Override
    public void run() {
        printer_046.print(job_046, jobId_046);
    }
}

public class PrinterSynchronization_046 {
    public static void main(String[] args) {
        Printer_046 printer_046 = new Printer_046(1); // Only one job allowed at a time
        Thread job1_046 = new Thread(new PrintJob_046(printer_046, "Document A", 1));
        Thread job2_046 = new Thread(new PrintJob_046(printer_046, "Document B", 2));
        Thread job3_046 = new Thread(new PrintJob_046(printer_046, "Document C", 3));
        job1_046.start();
        job2_046.start();
        job3_046.start();
        try {
            job1_046.join();
            job2_046.join();
            job3_046.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
