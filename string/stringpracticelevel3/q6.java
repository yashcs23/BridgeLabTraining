package stringpracticelevel3;

import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int[] freq = new int[str.length()];
        String[][] result = new String[str.length()][2];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (chars[i] != '0') {
                result[count][0] = String.valueOf(chars[i]);
                result[count][1] = String.valueOf(freq[i]);
                System.out.println(result[count][0] + " = " + result[count][1]);
                count++;
            }
        }
    }
}
