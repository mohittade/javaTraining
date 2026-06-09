import java.util.Stack;

public class Queueusing {


   static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

   static void enqueue(int data) {
        stack1.push(data);
    }


    static void dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        stack2.pop();

        while(stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }
    


    static void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = stack2.size() - 1; i >= 0; i--) {
            System.out.print(stack2.get(i) + " ");
        }
        for (int i = 0; i < stack1.size(); i++) {
            System.out.print(stack1.get(i) + " ");
        }
        System.out.println();
    }


   public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println("Queue after enqueuing 1, 2, 3:");
        display();

        dequeue();
        System.out.println("Queue after dequeuing one element:");
        display();

        dequeue();
        dequeue();
        System.out.println("Queue after dequeuing all elements:");
        display();
}
}