package Contest2_NumberSystem_And_DataTypes;

public class sum_odd_even_placed_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=2635;
        int sum_odd=0;
        int sum_even=0;
        int place=1;
        while(n>0) {
        	int num=n%10;
        	if(place%2==0) {
        		sum_odd=sum_odd+num;
        	}
        	else {
        		sum_even=sum_even+num;
        	}
        	n=n/10;
        	place++;
        }
        System.out.println(sum_odd);
        System.out.println(sum_even);
	}

}
