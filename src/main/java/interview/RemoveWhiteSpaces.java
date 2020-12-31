package interview;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="Java     Program    Selenium   Automation";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
