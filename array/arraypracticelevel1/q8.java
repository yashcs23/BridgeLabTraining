package arraypracticelevel1;

import java.util.Scanner;


class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int max = 10;
        int f[] = new int[max];
        int idx = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                if (idx == max) {
                    max *= 2;
                    int t[] = new int[max];
                    for (int j = 0; j < f.length; j++) t[j] = f[j];
                    f = t;
                }
                f[idx++] = i;
            }
        }
        System.out.print("Factors: ");
        for (int i = 0; i < idx; i++) System.out.print(f[i] + " ");
    }
}
