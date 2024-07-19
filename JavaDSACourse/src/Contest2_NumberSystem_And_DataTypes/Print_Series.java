package Contest2_NumberSystem_And_DataTypes;

public class Print_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n1=10;
		  int n2=4;
		  int n=1;
		  int count=0;
		  while(count<n1) {
		         int term=3*n+2;
			  if(term%n2!=0 && n2%term!=0) {
				  System.out.println(term);
				  count++;
			  }
			  n++;
			  
		  
		  }

	}

}
