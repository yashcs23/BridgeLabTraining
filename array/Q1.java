package arraypractice;

public class Q1 {
	public static void main(String[]args) {
	int arr[] = {1,2,3,3,3};
	int ele = 3;
	int cnt = 0;
	for(int i = 0 ; i< arr.length ; i++) {
		if(arr[i] == ele) {
			cnt++;
		}
	}
	System.out.println(cnt);
}
}
