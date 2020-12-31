package interview;

public class ArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,40,23,67,50,34,56,76};
		int search_ele=50;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if(search_ele==arr[i]) {
				System.out.println("Element found at "+(i+1)+"th position: "+arr[i]);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Element Not Found");
	}

}
