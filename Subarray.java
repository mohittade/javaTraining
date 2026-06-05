public class Subarray {


    public static void main(String[] args) {


        //find the count of all  substroing whoes sum is <=k


        int arr[] = {1,2,3,5,6,7,8,9};
        int k = 10;


        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum<=k){
                    System.out.println("subarray is "+i+" "+j);
                }else{
                    break;
                }
            }
        }
        
    }
    
}
