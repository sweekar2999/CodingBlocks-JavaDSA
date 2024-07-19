package Contest2_NumberSystem_And_DataTypes;

public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=102;
		int n=num;
		int count=0,d;
		while(n>0) {
			count++;
			n=n/10;
		}
		int arr[]=new int[count];
		int i=count-1;
		while(num>0) {
			d=num%10;
			num=num/10;
			if(d==0) {
				d=5;
			}
			arr[i--]=d;
		}
		for(int j=0;j<count;j++) {
			System.out.print(arr[j]);
		}

	}

}
