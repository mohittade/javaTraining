public class Findsmall_large {


    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5};

        int small = arr[0];
        int large = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
            if(arr[i] > large){
                large = arr[i];
            }
        }

        System.out.println("Smallest: " + small);
        System.out.println("Largest: " + large);
    }
    
}
