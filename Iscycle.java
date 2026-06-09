public class Iscycle {



    public static void main(String[] args) {
       int [] arr = {1, 3, 2, 4, 2};

       int slow = 0;
       int fast = 0;

       while(slow !=fast || slow == 0){
        slow = arr[slow];
        fast = arr[arr[fast]];
       }


         System.out.println("Cycle detected at index: " + slow);


         
        

}
    
}
