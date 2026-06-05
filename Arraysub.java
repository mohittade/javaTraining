public class Arraysub {





    public static void main (String[] args){





        //find length of longest subarray with sum <= k
        int arr[] = {1, 2,1,0,1,0,3};
        int k = 4; 

//find with for loop
        int max=0;  
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+=arr[j];
                if(sum<=k){
                    max = (j-i+1)>max?(j-i+1):max;
                }else{
                    break;
                }
            }
           while(sum>k){
                sum-=arr[i];
                i++;
            }
            // removed invalid j usage (j is out of scope here)
            


        
        }
    System.out.println("Maximum length of subarray with sum <= k: " + max);
}
}