import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if (withdraw > balance) {
            System.out.println("Transaction Failed: Insufficient Balance");
        }
        else if ((balance - withdraw) < 1000) {
            System.out.println("Transaction Failed: Minimum balance violation");
        }
        else {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance = " + (balance - withdraw));
        }
    }
}