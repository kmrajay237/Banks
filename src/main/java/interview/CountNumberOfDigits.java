package interview;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		int num=sc.nextInt();
		sc.close();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Count of Digits in number is "+count);
		
	}

}
