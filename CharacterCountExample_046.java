public class CharacterCountExample_046 {
    public static void main(String[] args) {
        String k = "Hello123World456";
        // Create ThreadA_046 to count digits
        Thread threadA_046 = new Thread(new ThreadA_046(k));
        // Create ThreadB_046 to count alphabetic characters
        Thread threadB_046 = new Thread(new ThreadB_046(k));
        // Start both threads
        threadA_046.start();
        threadB_046.start();
        try {
            // Wait for both threads to finish
            threadA_046.join();
            threadB_046.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ThreadA_046 implements Runnable {
    private String input;

    public ThreadA_046(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        int digitsCount_046 = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitsCount_046++;
            }
        }
        System.out.println("ThreadA_046: digitsCount_046 " + digitsCount_046);
    }
}

class ThreadB_046 implements Runnable {
    private String input;

    public ThreadB_046(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        int alphabeticCount_046 = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabeticCount_046++;
            }
        }
        System.out.println("ThreadB_046: alphabeticCount_046 " + alphabeticCount_046);
    }
}
