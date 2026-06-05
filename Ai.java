import java.util.Scanner;
public class Ai {
 
    

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);

        int arr1[] = new int[sc.nextInt()];


        for(int i=0; i<arr1.length; i++){
            arr1[i] = i+1;

            System.out.println(arr1[i]);
        }
    }
}
