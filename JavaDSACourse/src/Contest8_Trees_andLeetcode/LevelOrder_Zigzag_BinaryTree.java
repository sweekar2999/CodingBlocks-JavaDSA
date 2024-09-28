package Contest8_Trees_andLeetcode;

import java.util.*;

public class LevelOrder_Zigzag_BinaryTree {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BinaryTree bt = new LevelOrder_Zigzag_BinaryTree().new BinaryTree(scn);
        bt.levelOrderZZ();
        scn.close();
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
        private Scanner scn;

        public BinaryTree(Scanner scn) {
            this.scn = scn;
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {
            int cdata = scn.nextInt();
            if (cdata == -1) return null; 

            Node child = new Node(cdata);
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

        public void levelOrderZZ() {
            Soln(root);
        }

        private void Soln(Node temp) {
            if (temp == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(temp);
            boolean leftToRight = true;

            while (!q.isEmpty()) {
                int size = q.size();
                Deque<Integer> ans = new LinkedList<>();

                for (int i = 0; i < size; i++) {
                    Node curr = q.poll();

                    if (leftToRight) {
                        ans.addLast(curr.data);
                    } else {
                        ans.addFirst(curr.data);
                    }

                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                for (int val : ans) {
                    System.out.print(val + " ");
                }
                System.out.println();
                leftToRight = !leftToRight;
            }
        }
    }
}
