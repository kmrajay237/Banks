package interview;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortBuiltInMethod {

	public static void main(String[] args) {
		Integer arr[]= {1,4,6,2,7,9,20,54};
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		Arrays.parallelSort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		System.out.println("*******************************");
		System.out.println("Before Sorting: "+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting: "+Arrays.toString(arr));
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("After Sorting: "+Arrays.toString(arr));
	}

}
