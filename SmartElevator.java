import java.util.Scanner;

public class SmartElevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentFloor = sc.nextInt();

        int req1 = sc.nextInt();
        String dir1 = sc.next();

        int req2 = sc.nextInt();
        String dir2 = sc.next();

        // Assume elevator moving in req1 direction
        if (dir1.equalsIgnoreCase("up") && req1 > currentFloor) {
            System.out.println("Next Stop = " + req1);
        }
        else if (dir2.equalsIgnoreCase("up") && req2 > currentFloor) {
            System.out.println("Next Stop = " + req2);
        }
        else {
            System.out.println("Next Stop = " + req1);
        }
    }
}