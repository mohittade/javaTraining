import java.util.Stack;
public class Nextgreatest {




    static int[] nextGreatest(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[arr.length];

        int n= arr.length;

        for (int i = n - 1; i >= 0; i--) {
            
            stack.push(arr[i]);
            while (!stack.isEmpty() ) {

                if (stack.peek() > arr[i]) {
                    result[i] = stack.peek();
                break;
                } else {
                    stack.pop();    
                }

                }

                if (stack.isEmpty()) {
                result[i] = -1;
                
            } 

            stack.push(arr[i]);
            }

            return result;
        }
        
    

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[]    res = nextGreatest(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        
    }


    
}
