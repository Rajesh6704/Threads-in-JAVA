import java.util.Random;

class RandomNumberGenerator_046 implements Runnable {
    @Override
    public void run() {
        Random rand_046 = new Random();
        while (true) {
            int randomNumber_046 = rand_046.nextInt(100); // Generate a random integer between 0 and 99
            System.out.println("Generated Random Number: " + randomNumber_046);
            if (randomNumber_046 % 2 == 0) {
                ThreadEvenSquare_046 evenSquareThread_046 = new ThreadEvenSquare_046(randomNumber_046);
                Thread t1_046 = new Thread(evenSquareThread_046);
                t1_046.start();
            } else {
                ThreadOddCube_046 oddCubeThread_046 = new ThreadOddCube_046(randomNumber_046);
                Thread t2_046 = new Thread(oddCubeThread_046);
                t2_046.start();
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadEvenSquare_046 implements Runnable {
    private int number_046;

    public ThreadEvenSquare_046(int number_046) {
        this.number_046 = number_046;
    }

    @Override
    public void run() {
        int square_046 = number_046 * number_046;
        System.out.println("Square of " + number_046 + " is " + square_046);
    }
}

class ThreadOddCube_046 implements Runnable {
    private int number_046;

    public ThreadOddCube_046(int number_046) {
        this.number_046 = number_046;
    }

    @Override
    public void run() {
        int cube_046 = number_046 * number_046 * number_046;
        System.out.println("Cube of " + number_046 + " is " + cube_046);
    }
}

public class MultiThreadApp_046 {
    public static void main(String[] args) {
        RandomNumberGenerator_046 randomNumberGenerator_046 = new RandomNumberGenerator_046();
        Thread t0_046 = new Thread(randomNumberGenerator_046);
        t0_046.start();
    }
}

