package methodpracticelevel1;

import java.util.Scanner;

class Q9 {
    public static int[] findRemainderAndQuotient(int num, int div) {
        return new int[]{num % div, num / div};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + res[1] + " Remaining: " + res[0]);
    }
}
