package arraypractice;

public class Q6 {
	public static void main(String[]args) {
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,9,5};
		int arr3[] = new int[arr1.length + arr2.length];
		for(int i = 0 ; i< arr1.length ; i++) {
			arr3[i] = arr1[i];
		}
		for(int i = 0 ; i< arr2.length ; i++) {
			arr3[i+arr1.length] = arr2[i];
		}
		
		for(int i = 0 ; i< arr3.length ; i++) {
			System.out.print(arr3[i] + " ");
		}
	}

}
