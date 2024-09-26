package Contest8_Trees_andLeetcode;

import java.util.*;

public class ArrayList_of_levels_Binary_Tree {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList_of_levels_Binary_Tree m = new ArrayList_of_levels_Binary_Tree();
        BinaryTree bt1 = m.new BinaryTree();
        System.out.println(bt1.levelArrayList());
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;

            Node(int data) {
                this.data = data;
            }
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {
            int cdata = scn.nextInt();
            Node child = new Node(cdata);
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();
            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();
            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public ArrayList<ArrayList<Integer>> levelArrayList() {
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            if (root == null) {
                return result;
            }

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                ArrayList<Integer> currLvl = new ArrayList<>();
                int size = queue.size(); // Number of nodes at the current level

                for (int i = 0; i < size; i++) {
                    Node curr = queue.poll();
                    currLvl.add(curr.data);

                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }

                result.add(currLvl);
            }

            return result;
        }
    }
}
