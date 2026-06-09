
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Bst1 {


    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node buildBST(Integer[] arr, int start, int end) {

        if (arr.length==0 || start > end) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(arr[0]);
        queue.offer(root);

        int i = 1;
        while (i<arr.length && !queue.isEmpty()) {
            Node current = queue.poll();
            if(i<arr.length && arr[i]!=null) // Move to the right half for the next iteration
            {
                current.left = new Node(arr[i]);
                queue.offer(current.left);
            }

            if(i+1<arr.length && arr[i+1]!=null) // Move to the right half for the next iteration
            {
                current.right = new Node(arr[i+1]);
                queue.offer(current.right);
            }
            i+=2; // Move to the next pair of elements in the array
        }

        return root;

    }



    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }


    static Node insert(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            if (root.left == null) {
                root.left = new Node(key);
            } else {
                insert(root.left, key);
            }
        } else {
            if (root.right == null) {
                root.right = new Node(key);
            } else {
                insert(root.right, key);
            }
        }
        return root;
    }



    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

     static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }


    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
      Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            if (current.data == key) {
                return true;
            }
            if (current.left != null) {
                queue.offer(current.left);
            }
            if (current.right != null) {
                queue.offer(current.right);
            }
        }
        return false;
    }



    static Node height(Node root) {
        if (root == null) {
            return null;
        }
        Node leftHeight = height(root.left);
        Node rightHeight = height(root.right);
        return new Node(1 + Math.max(leftHeight.data, rightHeight.data));
    }


    static boolean isvalidBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
    
        if (root.data < min.data || root.data > max.data) {
            return false;
        }
        return isvalidBST(root.left, min, root) && isvalidBST(root.right, root, max);
    }



    static void topview(Node root) {
        if (root == null) {
            return;
        }
       Deque<Node> leftStack = new LinkedList<>();
        Deque<Node> rightStack = new LinkedList<>();

        Node current = root;
        while (current != null) {
            leftStack.push(current);
            current = current.left;
        }

        current = root.right;
        while (current != null) {
            rightStack.push(current);
            current = current.right;
        }

        while (!leftStack.isEmpty()) {
            System.out.print(leftStack.pop().data + " ");
        }
        System.out.print(root.data + " ");
        while (!rightStack.isEmpty()) {
            System.out.print(rightStack.pop().data + " ");
        }
         System.out.println();
    }
    



      


    static void leftview(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                if (i == 0) { // Print the first node of each level
                    System.out.print(current.data + " ");
                }
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
    }
    public static void main(String[] args) {


         Integer[] arr = {30,20,40,15,25,35,45};

        Node root = buildBST(arr, 0, arr.length - 1);
        // inorder(root);
        // insert(root, 41);
        // System.out.println();
        // inorder(root);


        // System.out.println(search(root, 25)); // true
        // System.out.println(search(root, 50)); // false

        System.out.println(isvalidBST(root, new Node(Integer.MIN_VALUE), new Node(Integer.MAX_VALUE))); // true




        topview(root); // 15 20 30 40 45
        leftview(root); // 30 20 15

        

    }
}
