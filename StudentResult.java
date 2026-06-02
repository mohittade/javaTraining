import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int sum = 0;
        boolean fail = false;

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];

            if (marks[i] < 33)
                fail = true;
        }

        double avg = sum / 5.0;

        if (fail) {
            System.out.println("Fail");
        }
        else if (avg >= 75) {
            System.out.println("Distinction");
        }
        else if (avg >= 60) {
            System.out.println("First Class");
        }
        else if (avg >= 50) {
            System.out.println("Second");
        }
        else {
            System.out.println("Pass");
        }
    }
}