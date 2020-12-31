package interview;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=16461,reversed=0;
		int org_num=number;
		while(number!=0) {
			reversed=reversed*10+number%10;
			number=number/10;
		}
		if (org_num==reversed) {
			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}
	}

}
