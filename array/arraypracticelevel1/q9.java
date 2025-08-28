package arraypracticelevel1;

import java.util.Scanner;


class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int b[] = new int[r * c];
        int k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[k++] = a[i][j];
            }
        }
        System.out.print("1D Array: ");
        for (int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
    }
}
