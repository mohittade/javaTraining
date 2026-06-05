public class Linearseacrch {




    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] == target){
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
    
}
