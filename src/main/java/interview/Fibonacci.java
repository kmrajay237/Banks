package interview;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Terms");
		int terms = sc.nextInt();
		sc.close();
		int firstTerm = 0, secondTerm = 1, nextTerm = 0;
		System.out.print(firstTerm + " " + secondTerm);
		for (int i = 2; i <= terms; i++) {
			nextTerm = firstTerm + secondTerm;
			System.out.print(" "+nextTerm+" ");
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}

}
