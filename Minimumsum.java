public class Minimumsum {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int k = 6;
        int sum = 0;

    



        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k){
                System.out.println("Subarray from index 0 to " + i + " has sum: " + k);
                
            }
            if(sum > k){
                while(sum > k && i >= 0){
                    sum -= arr[i];
                    i--;
                }   
                if(sum == k){
                    System.out.println("Subarray from index " + (i + 1) + " to " + (i + 1) + " has sum: " + k);
                }
            }
        }


       
        
    }
}