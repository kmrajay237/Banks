package interview;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		sc.close();
		int rem,sum=0;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}

}
