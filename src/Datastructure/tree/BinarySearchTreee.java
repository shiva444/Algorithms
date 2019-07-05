package Datastructure.tree;

import java.util.Scanner;

public class BinarySearchTreee {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    Node getNode(int data) {
        Node node = new Node(data);
        node.data = data;
        node.right = null;
        node.left = null;
        return node;
    }

    Node insertRec(Node root, int data) {
        /* checking base cases */
        if (root == null) {
            root = new Node(data);
            return root;
        }
        /* if less than data -> left *
         /* if greater than data -> right */

        if (data <= root.data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    Node search(int data, Node root) {
        if (root == null || root.data == data)
            return root;
        if (data <= root.data)
            return search(data, root.left);
        else
            return search(data, root.right);
    }

    public static void main(String[] args) {
        BinarySearchTreee tree = new BinarySearchTreee();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Enter your input to search  : " + input);
    }

    Node delete(Node root, int data) {
        //checking corner case
        if (root == null)
            return null;
        else if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        //with no child
        else {
            if (root.left == null && root.right == null) {
                delete(root, data);
                root = null;
            }
            //with one child
            else if (root.left == null) {
                Node temp = root;
                root = root.right;
                delete(temp, data);
            }
            else if (root.right == null) {
                Node temp = root;
                root = root.left;
                delete(temp, data);
            }
            //two children
            else {
                Node temp = findMin(root.right);
                root.data = temp.data;
                root.right = delete(root.right, temp.data);
            }
        }
        return root;
    }

     Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }
    void inorder()  {
        inorderRec(root);
    }

    void inorderRec(Node root){
        if(root == null)
            return;
        inorderRec(root.left);
        System.out.println("root data is :" + root.data);
        inorderRec(root.right);
    }

}












































