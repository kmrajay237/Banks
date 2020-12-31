package interview;

public class MaxMinElementInArray {

	public static void main(String[] args) {
		int a[]= {10,29,30,4,51,6,7,8,9};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println("Maximum: "+max);
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum: "+min);
	}

}
