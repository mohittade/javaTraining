
import java.util.*;

public class LInklist {

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


static Node addatposition(Node head, int data, int position) {
    Node newNode = new Node(data);

    if (position ==1) {
        return addhead(head, data);

    }
    Node temp = head;
    for (int i = 0; i < position - 1; i++) {
        temp = temp.next;
    }
    newNode.next = temp.next;
    temp.next = newNode;
    return head;
}




static Node deletehead(Node head) {
    if (head == null) {
        return null;
    }
    head = head.next;
    return head;


}


static Node deletetail(Node head) {
    if (head == null) {
        return null;
    }
    if (head.next == null) {
        return null;
    }
    Node temp = head;
    while (temp.next.next != null) {
        temp = temp.next;
    }
    temp.next = null;
    return head;
}



static Node deletewithData (Node head, int key) {
    if (head == null|| head.next == null && head.data != key) {
        return head;
    }
    if (head.data == key) {
        return head;
    }
    Node temp = head;
    while (temp.next != null && temp.next.data != key) {
        temp = temp.next;
    }
    if (temp.next != null) {
        temp.next = temp.next.next;
    }

    if (temp.next == null) {
        return head;
    }    
    
  return head;
} 




static Node UpdatewithData(Node head, int key, int newData) {
    if (head == null) {
        return null;
    }
    Node temp = head;
    while (temp != null && temp.data != key) {
        temp = temp.next;
    }
    if (temp != null) {
        temp.data = newData;
    }
    return head;
}



static Node findmidNode(Node head) {
    if (head == null) {
        return null;
    }
    Node turtel = head;
    Node rabbit = head;
    while (rabbit.next.next != null && rabbit.next != null) {
        turtel = turtel.next;
        rabbit = rabbit.next.next;
    }
    return turtel;
}




static Node Reverselist(Node head) {
    if (head == null) {
        return null;
    }
    Node prev = null;
    Node curr = head;
    while (curr != null) {
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;

}



static Node additiontwolist( Node head1, Node head2 ) {
    if (head1 == null && head2 == null) {
        return null;
    }
    
    if (head1 == null) {
        return head2;
    }
    if (head2 == null) {
        return head1;
    }
    Node temp1 = Reverselist(head1);
    Node temp2 = Reverselist(head2);
    int carry = 0;
    Node res=new Node(-1);

   while (temp1!=null && temp2!=null) {
    

    int sum = temp1.data + temp2.data+ carry;

    Node newNode = new Node(sum % 10);
    carry = sum / 10;
    newNode.next = res.next;
    res.next = newNode;
    
    }


    while (temp1 != null) {
        
        Node newNode = new Node(temp1.data);

        newNode.next = res.next;
        res.next = newNode;
        temp1 = temp1.next;
        
    }


    while (temp2 != null) {
        
        Node newNode = new Node(temp2.data);

        newNode.next = res.next;
        res.next = newNode;
        temp2 = temp2.next;
        
    }
    if (carry != 0) {
        Node newNode = new Node(carry);
        newNode.next = res.next;
        res.next = newNode;

        
    }

    return res.next;
    
}

static Node detectcyclestart(Node head) {
    if (head == null) {
        return null;
    }
    Node turtel = head;
    Node rabbit = head;
    while (rabbit.next != null && rabbit.next.next != null) {
        turtel = turtel.next;
        rabbit = rabbit.next.next;
        if (turtel == rabbit) {
            break;
        }
    }
    if (rabbit.next == null || rabbit.next.next == null) {
        return null;
    }
    turtel = head;
    while (turtel != rabbit) {
        turtel = turtel.next;
        rabbit = rabbit.next;
    }
    return turtel;

}


static boolean detectcycle(Node head) {
    if (head == null) {
        return false;
    }
    Node turtel = head;
    Node rabbit = head;
    while (rabbit.next != null && rabbit.next.next != null) {
        turtel = turtel.next;
        rabbit = rabbit.next.next;
        if (turtel == rabbit) {
            return true;
        }
    }
    return false;
}

static void printList(Node head) {
    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println("null");
}

public static void main(String[] args) {
    


    Node head = new Node(0);

    head = addhead(head, 1);


//
    
    
    
    
    Node head1 = null;
    Node head2 = null;


            head1=addtail(head1,7);
            head2=addtail(head2, 6);
            head1=addtail(head1, 4);
            head2=addtail(head2, 8);
            head1=addtail(head1, 3);
            head2=addtail(head2, 9);


            printList(head1);
            printList(head2);
          


            
            Node result = additiontwolist(head1, head2);
            printList(result);
            
//     head1.next=new Node(20);
//     head1.next.next=new Node(30);       
//     head1.next.next.next=new Node(40);
 
//     head1.next.next.next.next=head1.next; // create a cycle in the linked list
     
    

//    System.out.println(detectcycle(head1));

//    System.out.println(detectcyclestart(head1).data);
        

          
        //create a linked list with 5 nodes and print the values of the nodes
      
    }
}
