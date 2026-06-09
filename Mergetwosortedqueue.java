public class Mergetwosortedqueue {

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

        void dequeue() {
            if (front == null) {
                System.out.println("Queue is empty");
                return;
            }
            front = front.next;
        }


        

         static QueueLinkedList mergeSortedQueues(QueueLinkedList q1, QueueLinkedList q2) {
            QueueLinkedList mergedQueue = new QueueLinkedList();
            Node current1 = q1.front;
            Node current2 = q2.front;

            while (current1 != null && current2 != null) {
                if (current1.data < current2.data) {
                    mergedQueue.enqueue(current1.data);
                    current1 = current1.next;
                } else {
                    mergedQueue.enqueue(current2.data);
                    current2 = current2.next;
                }
            }

            while (current1 != null) {
                mergedQueue.enqueue(current1.data);
                current1 = current1.next;
            }

            while (current2 != null) {
                mergedQueue.enqueue(current2.data);
                current2 = current2.next;
            }

            return mergedQueue;
        } 


            void display() {
                if (front == null) {
                    System.out.println("Queue is empty");
                    return;
                }
                Node temp = front;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }





    public static void main(String[] args) {
        QueueLinkedList queue1 = new QueueLinkedList();
        QueueLinkedList queue2 = new QueueLinkedList();

        queue1.enqueue(1);
        queue1.enqueue(3);
        queue1.enqueue(5);

        queue2.enqueue(2);
        queue2.enqueue(4);
        queue2.enqueue(6);

        QueueLinkedList mergedQueue = mergeSortedQueues(queue1, queue2);

        System.out.println("Merged Queue:");
        mergedQueue.display();
    }
    
}
}