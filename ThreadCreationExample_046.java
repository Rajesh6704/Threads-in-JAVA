import java.util.Scanner;

class UserThreadPriority_046 extends Thread {
    private String k_046;
    private char c_046;

    public UserThreadPriority_046(String name) {
        super(name);
    }

    public void setValues_046(String k_046, char c_046) {
        this.k_046 = k_046;
        this.c_046 = c_046;
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
        System.out.println("k_046: " + k_046);
        System.out.println("c_046: " + c_046);
    }
}

public class ThreadCreationExample_046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String (k_046): ");
        String userInputK_046 = scanner.nextLine();
        System.out.print("Enter a Character (c_046): ");
        char userInputC_046 = scanner.nextLine().charAt(0);
        UserThreadPriority_046 threadobj1_046 = new UserThreadPriority_046("ThreadA_046");
        UserThreadPriority_046 threadobj2_046 = new UserThreadPriority_046("ThreadB_046");
        threadobj1_046.setValues_046(userInputK_046, userInputC_046);
        threadobj2_046.setValues_046(userInputK_046, userInputC_046);
        threadobj1_046.start();
        threadobj2_046.start();
        scanner.close();
    }
}
