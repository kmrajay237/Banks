package interview;

import java.util.HashSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		String s[]= {"Java","c","c++","Python","Java"};
		boolean flag=false;
		/*for (int i = 0; i < s.length; i++) {
			for (int j =i+ 1; j < s.length; j++) {
				if(s[i]==s[j]) {
					System.out.println("Duplicate Found: "+s[i]);
					flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("Duplicate Element not found");
		}*/
		HashSet<String> lang=new HashSet<String>();
		for (String l : s) {
			if (lang.add(l)==false) {
				System.out.println("Duplicate Found: "+l);
				flag=true;
			}
		}
		if(flag==false)
			System.out.println("Duplicate Not Found");
	}

}
