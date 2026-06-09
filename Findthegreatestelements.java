import java.util.Stack;

public class Findthegreatestelements {







    static int findnextGreatestElements(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

         // Return the greatest elements for all the next greater elements
        int greatest = Integer.MIN_VALUE;

        for (int i = 0; i < result.length; i++) {
            if (result[i] != -1) {
                greatest = Math.max(greatest, result[i]);
            }
        }

        return greatest;

        
    }
        public static void main(String[] args) {



     
         int[] arr = {4, 5, 2, 10,};        

            


            int ans = findnextGreatestElements(arr);
            System.out.println(ans);
        
       
    }



    
}
