package arraypractice;

public class Q5 {
	public static void main(String[]args) {
		int arr[] = {1,2,3,3,3};
		int check = 0;
		for(int i = 1 ; i<arr.length ; i++) {
			if(arr[i-1] > arr[i]) {
				check =1;
				break;
			}
		}
		
		if(check == 1) {
			System.out.println("False");
		}
		else {
			System.out.println("True");

		}
	}
}
