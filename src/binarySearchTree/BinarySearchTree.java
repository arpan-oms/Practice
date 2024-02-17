package binarySearchTree;

public class BinarySearchTree {
    Node root;
    void insertKey(char key) {
        root = insertInTree(root, key);
    }

    Node insertInTree(Node root, char key) {
        if (root == null) {
            root = new Node(key);
        } else if (key < root.key) {
            root.left = insertInTree(root.left, key);
        } else if (key > root.key) {
            root.right = insertInTree(root.right, key);
        }
        return root;
    }

    void inOrderTraversal (Node root) {
        if (root !=null) {
            inOrderTraversal(root.left);
            System.out.println(root.key + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree t1 = new BinarySearchTree();
        t1.insertKey('C');
        t1.insertKey('Z');
        t1.insertKey('A');
        t1.insertKey('L');
        t1.insertKey('B');
        t1.inOrderTraversal(t1.root);
    }
}

class Node {
    char key;
    Node left, right;
    Node(char key) {
        this.key = key;
    }
}
