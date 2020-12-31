package interview;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		/*String str = "Welcome to java and Selenium";
		String words[] = str.split(" ");
		String reverseString = "";
		for (String item : words) {
			String reverseWord = "";
			for (int i = item.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + item.charAt(i);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);*/
		
		String str = "Welcome to java and Selenium";
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord=reverseWord+sb.toString()+" ";
		}
		System.out.println(reverseWord);
	}

}
