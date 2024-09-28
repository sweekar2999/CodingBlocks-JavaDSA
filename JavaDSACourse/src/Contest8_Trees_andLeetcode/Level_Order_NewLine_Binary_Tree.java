package Contest8_Trees_andLeetcode;

import java.util.*;

public class Level_Order_NewLine_Binary_Tree {

    public static void main(String[] args) {
        Level_Order_NewLine_Binary_Tree m = new Level_Order_NewLine_Binary_Tree();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderNewLine();
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

        public void levelOrderNewLine() {
            if (root == null) {
                return;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                ArrayList<Integer> currentLevel = new ArrayList<>();

                for (int i = 0; i < levelSize; i++) {
                    Node current = queue.poll();
                    currentLevel.add(current.data);

                    if (current.left != null) {
                        queue.add(current.left);
                    }
                    if (current.right != null) {
                        queue.add(current.right);
                    }
                }
                for (int i = 0; i < currentLevel.size(); i++) {
                    System.out.print(currentLevel.get(i));
                    if (i < currentLevel.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
