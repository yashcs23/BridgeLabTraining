package class_03_flowcontrol.java;

public class count_digits {
	public static void main(String [] args) {
		int num = 123456;
		int cnt = 0;
		while(num>0) {
			num = num/10;
			cnt++;
		}
		System.out.println(cnt);
}
}
