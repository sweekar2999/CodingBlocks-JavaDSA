package Contest8_Trees_andLeetcode;

import java.util.Scanner;

public class Remove_leaves_BinaryTree_cb {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Remove_leaves_BinaryTree_cb m = new Remove_leaves_BinaryTree_cb();
        BinaryTree bt = m.new BinaryTree();
        bt.removeLeaves();
        bt.display();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {
            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }
            return child;
        }

        public void display() {
            this.display(this.root);
        }

        private void display(Node node) {
            if (node == null) {
                return;
            }

            String str = "";

            if (node.left != null) {
                str += node.left.data;
            } else {
                str += "END";
            }

            str += " => " + node.data + " <= ";

            if (node.right != null) {
                str += node.right.data;
            } else {
                str += "END";
            }

            System.out.println(str);

            this.display(node.left);
            this.display(node.right);
        }

        public void removeLeaves() {
            this.root = this.removeLeaves(this.root);
        }

        private Node removeLeaves(Node temp) {
            if (temp == null) {
                return null;
            }
            if (temp.left == null && temp.right == null) {
                return null;
            }
            temp.left = removeLeaves(temp.left);
            temp.right = removeLeaves(temp.right);
            return temp;
        }
    }
}
