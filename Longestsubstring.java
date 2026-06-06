
import java.util.HashMap;
public class Longestsubstring {



    public static void main(String[] args) {


        int[] arr = {3,-2,5,-1,2,-3,6,2,4};
        int k = 7;
        int sum = 0;

        int count = 0;

       
        HashMap<Integer, Integer> map = new HashMap<>();




    //lenght of longest subarray with sum k, we can use a hashmap to store the prefix sum and its index, if we find the same prefix sum again, it means the subarray between the two indices has a sum of 0, so we can check if the length of this subarray is greater than the current max length
        int maxLength = 0;
        map.put(0, -1); // Initialize with sum 0 at index -1
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k){
                System.err.println("Subarray from index 0 to " + i + " has sum: " + k);
            }
            if(map.containsKey(sum - k)){
                System.err.println("Subarray from index " + (map.get(sum - k) + 1) + " to " + i + " has sum: " + k);
                int currentLength = i - map.get(sum - k);
                maxLength = Math.max(maxLength, currentLength);


            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }



          System.out.println("longest subarray with sum " + k + ": " + maxLength);
          System.out.println("Length of longest subarray with sum " + k + ": " + maxLength);
        
        
        System.out.println("Total number of subarrays with sum " + k + ": " + count);

            }

        //find lenght


      

    }
