import java.util.Scanner;

public class Tracficanalysis {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of hours (n): ");
        int arr[] = {4,8,15,3,10,12,5,9};

      int k=scanner.nextInt();
      int max=0;
      int current=0;

      for(int i=0 ; i<k; i++){
          current += arr[i];
          }



          max=current>max?current:max;


          for(int i=k; i<arr.length; i++){
              current-=arr[i-k];
              current+=arr[i];
              max = current>max?current:max;
          }



          System.out.println("Maximum traffic in any k consecutive hours: " + max);
      }
    
}
