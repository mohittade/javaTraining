public class Reversequeue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class QueueLinkedList {
        Node front;
        Node rear;

        QueueLinkedList() {
            this.front = null;
            this.rear = null;
        }

        void enqueue(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        int dequeue() {
            if (front == null) {
                throw new IllegalStateException("Queue is empty");
            }
            int data = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return data;
        }

        static void reverseQueue(QueueLinkedList queue) {
            if (queue.front == null) {
                return;
            }
            int data = queue.dequeue();
            reverseQueue(queue);
            queue.enqueue(data);
        }

        static void display(QueueLinkedList queue) {
            if (queue.front == null) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = queue.front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Original Queue:");
        QueueLinkedList.display(queue);

        QueueLinkedList.reverseQueue(queue);

        System.out.println("Reversed Queue:");
        QueueLinkedList.display(queue);
    }
}