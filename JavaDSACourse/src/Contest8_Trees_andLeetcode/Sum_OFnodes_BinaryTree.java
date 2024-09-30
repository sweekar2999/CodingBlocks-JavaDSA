package Contest8_Trees_andLeetcode;

import java.util.Scanner;

public class Sum_OFnodes_BinaryTree {

    public static void main(String[] args) {
        Sum_OFnodes_BinaryTree m = new Sum_OFnodes_BinaryTree();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.sumOfNodes());
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
            Scanner scn = new Scanner(System.in);
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

        public int sumOfNodes() {
            return this.sumOfNodes(this.root);
        }

        private int sumOfNodes(Node node) {
            if (node == null) {
                return 0;
            }
            int leftSum = sumOfNodes(node.left);
            int rightSum = sumOfNodes(node.right);
            return node.data + leftSum + rightSum;
        }
    }
}
