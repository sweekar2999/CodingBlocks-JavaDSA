package Contest8_Trees_andLeetcode;

import java.util.*;

public class Root_To_Leaf_binaryTree_cb {
    private Node root;
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public void buildTree(Scanner scn) {
        this.root = takeInput(scn, null, false);
    }

    private Node takeInput(Scanner scn, Node parent, boolean isLeft) {
        if (!scn.hasNextInt()) {
            throw new InputMismatchException("Expected an integer.");
        }
        int cData = scn.nextInt();
        Node child = new Node(cData, null, null);

        if (!scn.hasNextBoolean()) {
            throw new InputMismatchException("Expected a boolean.");
        }
        boolean choice = scn.nextBoolean();

        if (choice) {
            child.left = this.takeInput(scn, child, true);
        }

        if (!scn.hasNextBoolean()) {
            throw new InputMismatchException("Expected a boolean.");
        }
        choice = scn.nextBoolean();

        if (choice) {
            child.right = this.takeInput(scn, child, false);
        }

        return child;
    }
    public void rootToLeaf(int k) {
        ArrayList<ArrayList<Integer>> paths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        Soln(root, k, 0, currentPath, paths);
        for (ArrayList<Integer> path : paths) {
            for (int val : path) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private void Soln(Node temp, int k, int sum, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> paths) {
        if (temp == null) {
            return;
        }

        sum += temp.data;
        currentPath.add(temp.data);

        if (temp.left == null && temp.right == null) {
            if (sum == k) {
                paths.add(new ArrayList<>(currentPath));
            }
        } else {
            Soln(temp.left, k, sum, currentPath, paths);
            Soln(temp.right, k, sum, currentPath, paths);
        }

        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Root_To_Leaf_binaryTree_cb tree = new Root_To_Leaf_binaryTree_cb();
        tree.buildTree(scn);
        int k = scn.nextInt();
        tree.rootToLeaf(k);

        scn.close();
    }
}
