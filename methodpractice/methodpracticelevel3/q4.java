package methodpracticelevel3;

import java.util.Scanner;
import java.util.Arrays;


class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Problem 4: ");
        int number = sc.nextInt();
        sc.close();

        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseArray(digits);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Original digits array: " + Arrays.toString(digits));
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Are arrays equal? " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is Palindrome number? " + isPalindrome(number));
        System.out.println("Is Duck number? " + isDuckNumber(digits));
    }

    public static int countDigits(int number) {
        if (number == 0) return 1;
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }
}
