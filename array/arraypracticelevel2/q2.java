package arraypracticelevel2;

import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int h[] = new int[3];
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) h[i] = sc.nextInt();
        int yi = 0, ti = 0;
        for (int i = 1; i < 3; i++) {
            if (a[i] < a[yi]) yi = i;
            if (h[i] > h[ti]) ti = i;
        }
        String n[] = {"Amar", "Akbar", "Anthony"};
        System.out.println("Youngest: " + n[yi]);
        System.out.println("Tallest: " + n[ti]);
    }
}
