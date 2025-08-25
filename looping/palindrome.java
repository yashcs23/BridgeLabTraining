package class_03_flowcontrol.java;

public class palindrome {
	public static void main(String [] args) {
		int num = 1232;
		int r = num;
		int temp = 0;
		while(num>0) {
			int p = num%10;
			temp = temp *10 + p;
			num = num/10;
			
		}
		if(r == temp) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	
}
