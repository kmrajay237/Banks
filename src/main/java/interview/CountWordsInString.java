package interview;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println("Number of Words in String: "+count);
	}

}
