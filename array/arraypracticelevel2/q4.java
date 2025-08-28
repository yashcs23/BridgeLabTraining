package arraypracticelevel2;

import java.util.Scanner;


class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 10;
        int d[] = new int[max];
        int idx = 0;
        while (n > 0) {
            if (idx == max) {
                max += 10;
                int t[] = new int[max];
                for (int j = 0; j < d.length; j++) t[j] = d[j];
                d = t;
            }
            d[idx++] = n % 10;
            n /= 10;
        }
        int l1 = 0, l2 = 0;
        for (int i = 0; i < idx; i++) {
            if (d[i] > l1) { l2 = l1; l1 = d[i]; }
            else if (d[i] > l2 && d[i] != l1) l2 = d[i];
        }
        System.out.println("Largest: " + l1);
        System.out.println("Second Largest: " + l2);
    }
}
