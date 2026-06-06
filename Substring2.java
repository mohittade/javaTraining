
import java.util.HashMap;

public class Substring2 {



    public static void main(String[] args) {
        


//3,-2,5,,-1,2,-3,6,2,4
//3,1,6,5,7,4,10,8,12   



//prefix sum array use hashmap to store the prefix sum and its index, if we find the same prefix sum again, it means the subarray between the two indices has a sum of 0
//3,1,6,5,7,4,10,8,12 by adding 3, -2, 5, -1, 2, -3, 6, 2, 4

int[] arr = {3,-2,5,-1,2,-3,6,2,4};
int[] arr2 = {3,1,6,5,7,4,10,8,12};


int[] prefixSum = new int[arr.length + 1];


for(int i = 1; i <= arr.length; i++){
    prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
}

HashMap<Integer, Integer> map = new HashMap<>();
map.put(0, -1); // Initialize with sum 0 at index -1

for(int i = 1; i <= arr.length; i++){
    if(map.containsKey(prefixSum[i])){
        System.err.println("Subarray from index " + (map.get(prefixSum[i]) + 1) + " to " + (i - 1) + " has sum: 0");
    }
    map.put(prefixSum[i], i);
}



for(int i = 1; i <= arr2.length; i++){
    prefixSum[i] = prefixSum[i - 1] + arr2[i - 1];

    if(map.containsKey(prefixSum[i])){
        System.err.println("Subarray from index " + (map.get(prefixSum[i]) + 1) + " to " + (i - 1) + " has sum: 0");
    }
    else{
        map.put(prefixSum[i], i);
    }
}}}