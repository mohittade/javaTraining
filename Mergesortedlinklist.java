


public class Mergesortedlinklist {

     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

     static Node addhead(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }

        newNode.next = head;
        return newNode;
    }

        static Node addNode(Node head, int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return head;
            }
    
            newNode.next = head;
            return newNode;
    
        }




      static Node MergeSortedLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node mergedHead;

        if (head1.data <= head2.data) {
            mergedHead = head1;
            mergedHead.next = MergeSortedLists(head1.next, head2);
        } else {
            mergedHead = head2;
            mergedHead.next = MergeSortedLists(head1, head2.next);
        }

        return mergedHead;
    }


    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node addtail(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }       
        temp.next = newNode;
        return head;


    }
    //merge two sorted link list in such a manner is also sorted 
    public static void main(String[] args) {
        // create first sorted linked list


        //l1 15 30 45 60 75 
// 1 10 20 50 65 70 
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // create second sorted linked list
        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        // merge the two sorted linked lists
        Node mergedHead = MergeSortedLists(head1, head2);

        // print the merged sorted linked list
        printList(mergedHead);
    }


    
}
