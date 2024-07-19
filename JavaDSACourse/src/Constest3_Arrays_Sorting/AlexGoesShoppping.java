package Constest3_Arrays_Sorting;
import java.util.*;
public class AlexGoesShoppping {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	   /*     Scanner scanner = new Scanner(System.in);
	        
	        
	        int n = scanner.nextInt();
	        int[] prices = new int[n];
	        
	      
	        for (int i = 0; i < n; i++) {
	            prices[i] = scanner.nextInt();
	        }
	        
	       
	        int q = scanner.nextInt();
	        
	       
	        for (int i = 0; i < q; i++) {
	            int A = scanner.nextInt();
	            int k = scanner.nextInt();
	            
	            
	            boolean[] usedPrices = new boolean[n];
	            int distinctCount = 0;
	            
	            for (int j = 0; j < n; j++) {
	                int price = prices[j];
	                if (A % price == 0 && !usedPrices[j]) {
	                    usedPrices[j] = true;
	                    distinctCount++;
	                }
	            }
	            
	    
	            if (distinctCount >= k) {
	                System.out.println("Yes");
	            } else {
	                System.out.println("No");
	            }
	        }
	        
	        scanner.close();*/
			Scanner sc=new Scanner (System.in);
			int n=sc.nextInt();
			int price[]=new int[n];
			for(int i=0;i<n;i++) {
				price[i]=sc.nextInt();
			}
			int q=sc.nextInt();
			for(int i=0;i<q;i++) {
				int A=sc.nextInt();
				int k=sc.nextInt();
				int count=0;
				for(int j=0;j<n;j++) {
					int cost=price[j];
					if(A%cost==0) {
						count++;
					}
				}
				if(count>=k) {
					   System.out.println("Yes");
	            } else {
	                System.out.println("No");
				}
			}
	}

}
