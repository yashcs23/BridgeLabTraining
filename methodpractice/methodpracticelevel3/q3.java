package methodpracticelevel3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for Problem 3: ");
        int number = sc.nextInt();
        sc.close();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad number? " + isHarshadNumber(number));

        int[][] freq = findFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            System.out.println(freq[i][0] + ": " + freq[i][1]);
        }
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

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumDigits(storeDigits(number));
        return number % sum == 0;
    }

    public static int[][] findFrequency(int[] digits) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int digit : digits) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }

        int[][] freqArray = new int[frequencyMap.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            freqArray[i][0] = entry.getKey();
            freqArray[i][1] = entry.getValue();
            i++;
        }
        return freqArray;
    }
}
