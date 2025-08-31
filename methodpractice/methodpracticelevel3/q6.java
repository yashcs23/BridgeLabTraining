package methodpracticelevel3;

import java.util.Scanner;


class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Problem 6: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println("Is perfect number? " + NumberChecker.isPerfect(number));
        System.out.println("Is abundant number? " + NumberChecker.isAbundant(number));
        System.out.println("Is deficient number? " + NumberChecker.isDeficient(number));
        System.out.println("Is strong number? " + NumberChecker.isStrong(number));
    }
}

// numberchecker in q2
