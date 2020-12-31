package interview;

public class CountCharacterInString {

	public static void main(String[] args) {
		String str="java programming oops concepts";
		int len1=str.length();
		int len2=str.replaceAll("p", "").length();
		int count=len1-len2;
		System.out.println(count);
	}

}
