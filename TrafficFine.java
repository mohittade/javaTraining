import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int speed = sc.nextInt();
        String repeated = sc.next();

        int fine = 0;

        if (speed > 100)
            fine = 1000;
        else if (speed > 80)
            fine = 500;

        if (repeated.equalsIgnoreCase("Yes"))
            fine *= 2;

        System.out.println("Fine = " + fine);
    }
}