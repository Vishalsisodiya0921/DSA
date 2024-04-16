package BinaryTreeP1;
import java.util.Scanner;
public class BinaryTreePre {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node buildBinaryTree(Scanner sc) {
        int x = sc.nextInt();
        if (x == -1) {
            return null;
        }
        Node newNode = new Node(x);
        newNode.left = buildBinaryTree(sc);
        newNode.right = buildBinaryTree(sc);
        return newNode;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space-separated integers for the binary tree, use -1 to represent null nodes:");
        Node root = buildBinaryTree(sc);
        sc.close();

        System.out.println("Inorder: ");
        inOrder(root);
        System.out.println();

        System.out.println("Preorder: ");
        preOrder(root);
        System.out.println();

        System.out.println("Postorder: ");
        postOrder(root);
        System.out.println();
    }
}

