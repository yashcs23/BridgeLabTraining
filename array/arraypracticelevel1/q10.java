package arraypracticelevel1;

import java.util.Scanner;


class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("Not positive");
            return;
        }
        String b[] = new String[a + 1];
        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) b[i] = "FizzBuzz";
            else if (i % 3 == 0 && i != 0) b[i] = "Fizz";
            else if (i % 5 == 0 && i != 0) b[i] = "Buzz";
            else b[i] = String.valueOf(i);
        }
        for (int i = 0; i <= a; i++) {
            System.out.println("Position " + i + " = " + b[i]);
        }
    }
}
