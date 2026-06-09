 

import java.util.*;

import java.util.LinkedList;
import java.util.Queue;
 
 
 class Node {
        int data;
        Node left;
        Node right;

         Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
        
     }

 
 
 
 
 
 class Treeobs {

    


         Node createNode( int val) {
            Node newNode = new Node(val);
            return newNode;
           
        }


        void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

         void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }



        void preorderIterator(Node root){
         Deque<Node> stack = new ArrayDeque<>();
         stack.push(root);

         while (!stack.isEmpty()) {
             Node current = stack.pop();
             System.out.print(current.data + " ");
             if (current.right != null) {
                 stack.push(current.right);
             }
             if (current.left != null) {
                 stack.push(current.left);
             }
         }
          System.out.println(stack);

        }





        boolean ismirror(Node root1, Node root2) {
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null || root2 == null) {
                return false;
            }
            if (root1.data!=root2.data) {
                return false;
                
            }

            
            return (root1.data == root2.data) &&
                    ismirror(root1.left, root2.right) &&
                    ismirror(root1.right, root2.left);
        }


        int height(Node root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }





        int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            return 1+ height(root.right) + height(root.left);
        }


        boolean isequal(Node root1, Node root2) {
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null || root2 == null) {
                return false;
            }
            if (root1.data != root2.data) {
                return false;
            }
            return  root1.data == root2.data && isequal(root1.left, root2.left) && isequal(root1.right, root2.right);
        }



      void delete(Node root,int key){
            if(root==null) return;
            Queue<Node> que=new LinkedList<>();
            Node keyNode=null;
            Node curr=null;
            que.add(root);
            while(!que.isEmpty()){
                curr=que.poll();
                if(curr.data==key){
                    keyNode=curr;
                }
                if(curr.left!=null) que.offer(curr.left);
                if(curr.right!=null) que.offer(curr.right);
            }
            if(keyNode!=null){
                keyNode.data=curr.data;
                delLastNode(root, curr);
        }
    }
    void delLastNode(Node root,Node delNode){
        Queue<Node> que=new LinkedList<>();
        que.offer(root);
        while(!que.isEmpty()){
            Node curr=que.poll();
            if(curr.left==delNode){
                curr.left=null;
                return;
            }else{
                que.offer(curr.left);
            }
            if(curr.right==delNode){
                curr.right=null;
                return;
            }else{
                que.offer(curr.right);
            }
            if(curr.left!=null) que.offer(curr.left);
            if(curr.right!=null) que.offer(curr.right);
        }
    }
    


        String levelorder(Node root) {
            if (root == null) {
                return "";
            }
            StringBuilder result = new StringBuilder();
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while ( !queue.isEmpty()) {
                Node current = queue.poll();
                result.append(current.data).append(" ");
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            return result.toString();
        }




    Node buildtree(Integer[] arr){
        if (arr.length == 0) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(arr[0]);
        queue.offer(root);
        int i = 1;
        while (i < arr.length && !queue.isEmpty()) {
            Node ele = queue.poll();
            if (arr[i] != null) {
                ele.left = new Node(arr[i]);
                queue.offer(ele.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                ele.right = new Node(arr[i]);
                queue.offer(ele.right);
            }
            i++;
        }
        return root;
    }}

       








public class Doublelinklist {

    


    public static void main(String[] args) {


        Treeobs tree = new Treeobs();

        Node root = tree.createNode(10);
        root.left = tree.createNode(20);
        root.right = tree.createNode(30);
        root.left.left = tree.createNode(40);
        root.left.right = tree.createNode(50);
        root.right.left = tree.createNode(60);
        root.right.right = tree.createNode(70);




        Node root1 = tree.buildtree(new Integer[]{10, 20, 20, 40, 50, 60, 30});
        Node root2 = tree.buildtree(new Integer[]{10, 20, 20, 40, 50, 60, 30});
        // tree.preorder(root1);
        // System.out.println();        // System.out.println();
        // tree.postorder(root1);
        // System.out.println();
        // tree.levelorder(root1);
        // System.out.println();
        System.out.println(tree.ismirror(root1, root2));


        System.out.println("Height of the tree: " + tree.height(root));


        System.out.println("Diameter of the tree: " + tree.diameter(root));


        tree.delete(root1, 20);


        System.out.println("Level order traversal after deletion:"+tree.levelorder(root1));
       
       
    }}