package interview;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,5};
		int sum1=0,sum2=0;
		for (int i = 0; i < a.length; i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of Elements in Array: "+sum1);

		for(int i=1;i<=5;i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum of Range: "+sum2);
		
		int missingNumber=sum2-sum1;
		System.out.println("missingNumber: "+missingNumber);
	}

}
