

public class ImplementqueueusingTwostack {

    static class Stack {
        int[] arr;
        int top;
        int capacity;

        Stack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        void push(int x) {
            if (top == capacity - 1) {
                System.out.println("Stack overflow");
                return;
            }
            arr[++top] = x;
        }

        int pop() {
            if (top == -1) {
                throw new IllegalStateException("Stack underflow");
            }
            return arr[top--];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    static class QueueUsingTwoStacks {
        Stack stack1;
        Stack stack2;

        QueueUsingTwoStacks(int capacity) {
            stack1 = new Stack(capacity);
            stack2 = new Stack(capacity);
        }

        void enqueue(int data) {
            stack1.push(data);
        }

        int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (stack2.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return stack2.pop();
        }
    }



public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);   
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());
    
    }
}