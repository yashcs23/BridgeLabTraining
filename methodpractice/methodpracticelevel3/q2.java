package methodpracticelevel3;

import java.util.Scanner;
import java.util.Arrays;

class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Problem 2: ");
        int number = sc.nextInt();
        sc.close();

        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Count of digits: " + digits.length);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck number? " + NumberChecker.isDuckNumber(number));
        System.out.println("Is Armstrong number? " + NumberChecker.isArmstrong(number));
        
        int[] largest = NumberChecker.findLargest(digits);
        System.out.println("Largest digit: " + largest[0] + ", Second largest: " + largest[1]);
        
        int[] smallest = NumberChecker.findSmallest(digits);
        System.out.println("Smallest digit: " + smallest[0] + ", Second smallest: " + smallest[1]);
        
        System.out.println("Is Perfect? " + NumberChecker.isPerfect(number));
        System.out.println("Is Abundant? " + NumberChecker.isAbundant(number));
        System.out.println("Is Deficient? " + NumberChecker.isDeficient(number));
        System.out.println("Is Strong? " + NumberChecker.isStrong(number));
    }
}

class NumberChecker {
    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(number);
        return s.indexOf('0') > 0;  
    }

    public static boolean isArmstrong(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, numDigits);
        }
        return sum == number;
    }

    public static int[] findLargest(int[] digits) {
        int[] copy = Arrays.copyOf(digits, digits.length);
        Arrays.sort(copy);
        int largest = copy[copy.length - 1];
        int secondLargest = (copy.length > 1) ? copy[copy.length - 2] : -1;
        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallest(int[] digits) {
        int[] copy = Arrays.copyOf(digits, digits.length);
        Arrays.sort(copy);
        int smallest = copy[0];
        int secondSmallest = (copy.length > 1) ? copy[1] : -1;
        return new int[]{smallest, secondSmallest};
    }

    private static int getSumOfProperDivisors(int number) {
        if (number <= 1) return 0;
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) sum += number / i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(int number) {
        return getSumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return getSumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return getSumOfProperDivisors(number) < number;
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int number) {
        int[] digits = storeDigits(number);
        long sum = 0;
        for (int d : digits) {
            sum += factorial(d);
        }
        return sum == number;
    }
}
