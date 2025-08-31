package methodpracticelevel2;

import java.util.Scanner;

class Q12 {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = 1000 + (int)(Math.random()*9000);
        return arr;
    }
    public static double[] findAverageMinMax(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;
        for (int x : arr) { sum += x; if (x < min) min = x; if (x > max) max = x; }
        double avg = sum * 1.0 / arr.length;
        return new double[]{avg, min, max};
    }
    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        for (int n : nums) System.out.print(n + " ");
        double[] res = findAverageMinMax(nums);
        System.out.println("\nAverage=" + res[0] + " Min=" + res[1] + " Max=" + res[2]);
    }
}
