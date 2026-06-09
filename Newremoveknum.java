import java.util.*;

public class Newremoveknum {

    static int smallestnum(int n, int k) {
        Stack<Integer> stack = new Stack<>();
        String numStr = Integer.toString(n);

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            while (!stack.isEmpty() && stack.peek() > digit && k > 0) {
                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        if (sb.length() == 0)
            return 0;

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int ans = smallestnum(n, k);
        System.out.println(ans);

        sc.close();
    }
}