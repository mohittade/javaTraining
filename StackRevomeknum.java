import java.util.Stack;

public class StackRevomeknum {

    

    
    // reomve k element from stack to get the smallest number use stack to store the element and pop the element when the top of stack is greater than the current element and k is greater than 0
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {4,6,7,5,2,3 ,9};
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() > arr[i] && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(arr[i]);

        }
        System.out.println(stack);
       
    }



    
}
