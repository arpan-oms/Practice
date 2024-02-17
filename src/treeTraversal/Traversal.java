package treeTraversal;

class Node {
    char key;
    Node left, right;
    Node(char key) {
        this.key = key;
    }
}
class TreeTraversal {
    Node root;
    void preOrderTraversal(Node n) {
        if (n!=null) {
            System.out.print(n.key + " ");
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);
        }
    }

    void postOrderTraversal(Node n) {
        if (n!=null) {
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);
            System.out.print(n.key + " ");
        }
    }

    void inOrderTraversal(Node n) {
        if (n!=null) {
            preOrderTraversal(n.left);
            System.out.print(n.key + " ");
            preOrderTraversal(n.right);
        }
    }

}

public class Traversal {
    public static void main(String[] args) {
        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');

        t1.preOrderTraversal(t1.root);
        System.out.println();
        t1.postOrderTraversal(t1.root);
        System.out.println();
        t1.inOrderTraversal(t1.root);
        System.out.println();
    }
}