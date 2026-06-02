import java.util.Scanner;

public class TrainBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seats = sc.nextInt();
        String vip = sc.next();

        if (seats > 0 || vip.equalsIgnoreCase("Yes")) {
            System.out.println("Ticket Confirmed");
        }
        else {
            System.out.println("Waitlist");
        }
    }
}