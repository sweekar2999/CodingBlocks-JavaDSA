package Contest7_Stack_LL_and_Queue;
import java.util.*;
public class Triplet_from_3_LL {

	    public static class Node {
	        int val;
	        Node next;

	        Node(int val) {
	            this.val = val;
	            this.next = null;
	        }
	    }

	    public static Node createLinkedList(int[] arr) {
	        if (arr.length == 0) return null;
	        Node head = new Node(arr[0]);
	        Node current = head;
	        for (int i = 1; i < arr.length; i++) {
	            current.next = new Node(arr[i]);
	            current = current.next;
	        }
	        return head;
	    }
	    public static void findThreeElementsWithTarget(Node a, Node b, Node c, int target) {
	        Node tempA = a;
	        while (tempA != null) {
	            Node tempB = b;
	            while (tempB != null) {
	                Node tempC = c;
	                while (tempC != null) {
	                    int sum = tempA.val + tempB.val + tempC.val;
	                    if (sum == target) {
	                        System.out.println(tempA.val + " " + tempB.val + " " + tempC.val);
	                        return;
	                    }
	                    
	                    tempC = tempC.next;
	                }
	                tempB = tempB.next;
	            }
	            tempA = tempA.next;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arrA = new int[n];
	        for (int i = 0; i < n; i++) {
	            arrA[i] = sc.nextInt();
	        }

	        int[] arrB = new int[m];
	        for (int i = 0; i < m; i++) {
	            arrB[i] = sc.nextInt();
	        }

	        int[] arrC = new int[k];
	        for (int i = 0; i < k; i++) {
	            arrC[i] = sc.nextInt();
	        }
	        int target = sc.nextInt();
	        Node a = createLinkedList(arrA);
	        Node b = createLinkedList(arrB);
	        Node c = createLinkedList(arrC);
	        findThreeElementsWithTarget(a, b, c, target);
	        
	        sc.close();
	    }
	


	

}
