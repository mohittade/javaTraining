
import java.util.Scanner;

public class Rotatektime {


    public static void main(String[] args) {
        

      Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr1 = new int[n];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for(int i=0; i<k; i++){
            int temp = arr1[n-1];
            for(int j=n-2; j>=0; j--){
                arr1[j+1] = arr1[j];
            }
            arr1[0] = temp;
        }
    System.out.println("After rotation:");
        for(int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }

      
        

    }
    
}
