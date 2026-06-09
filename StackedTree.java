class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}






public class StackedTree {


  


   







public static void main(String[] args) {
        StackedTree tree = new StackedTree();
        Integer[] arr = {10,20,40, 50,30,70, null};
        Node root = tree.buildtree(arr);
        System.out.println("Preorder Traversal:");
        tree.preorder(root);
        System.out.println("\nInorder Traversal:");
        tree.inorder(root);
        System.out.println("\nPostorder Traversal:");
        tree.postorder(root);
        System.out.println("\nLevel Order Traversal:");
        tree.levelorder(root);
    }

    
}