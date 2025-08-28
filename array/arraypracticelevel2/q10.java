package arraypracticelevel2;

import java.util.Scanner;

class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d[] = new int[20];
        int idx = 0, t = n;
        while (t > 0) {
            d[idx++] = t % 10;
            t /= 10;
        }
        int f[] = new int[10];
        for (int i = 0; i < idx; i++) f[d[i]]++;
        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) System.out.println(i + " -> " + f[i]);
        }
    }
}
