/**
 * 
 */
package interview;

/**
 * @author qualitrix
 *
 */
public class Swapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=20;
		String str1="Hello",str2="world",temp;
		System.out.println("Before Swapping String:");
		System.out.println(str1+" "+str2);
//		temp=str1;
//		str1=str2;
//		str2=temp;
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("After Swapping String:");
		System.out.println(str1+" "+str2);
		
		
		
		System.out.println(a+" "+b);
//		Using 3rd Variable
//		int temp=a;
//		a=b;
//		b=temp;
		
//		Without Using 3rd variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
//		a=a*b;
//		b=a/b;
//		a=a/b;
		
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		b=a+b-(a=b);
		
		System.out.println("After Swapping:");
		System.out.println(a+" "+b);

	}

}
