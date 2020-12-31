package interview;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int first = sc.nextInt();

		System.out.println("Enter Second Number");
		int second = sc.nextInt();

		System.out.println("Enter Third Number");
		int third = sc.nextInt();
		sc.close();

		int largest = first > second ? first : second;
		largest = third > largest ? third : largest;
		
		System.out.println("The Largest Number: "+largest);
	}

}
