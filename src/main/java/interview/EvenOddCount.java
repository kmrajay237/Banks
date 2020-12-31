package interview;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		sc.close();
		int odd_count=0,even_count=0,rem;
		while(num>0) {
			rem=num%10;
			num=num/10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
		}
		System.out.println("Even Digit: "+even_count);
		System.out.println("Odd Digit: "+odd_count);

	}

}
