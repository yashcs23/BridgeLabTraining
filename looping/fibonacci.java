package class_03_flowcontrol.java;

public class fibonacci {
	public static void main(String [] args) {
		int i = 0;
		int j = 1;
		System.out.print(i + " " + j+ " ");

		
		for(int k = 2 ; k<= 10 ; k++) {
			int ans = i + j;
			System.out.print(ans + " ");
			i = j;
			j = ans;
		}

		}
}
