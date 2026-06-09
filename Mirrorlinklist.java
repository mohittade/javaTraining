public class Mirrorlinklist {
    




static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }


}


    

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
static Node mirrorList(Node head) {
    if (head == null) {
        return null;
    }

    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next; // Store the next node
        current.next = prev; // Reverse the current node's pointer
        prev = current; // Move prev to the current node
        current = next; // Move to the next node
    }

    return prev; // At the end, prev will be the new head of the mirrored list



  public static void main(String[] args) {
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);

    System.out.println("Original List:");
    printList(head);

    head = mirrorList(head);

    System.out.println("Mirrored List:");
    printList(head);

}   
}
}