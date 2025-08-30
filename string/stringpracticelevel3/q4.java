package stringpracticelevel3;

import java.util.Scanner;

class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        String[][] charFreq = new String[str.length()][2];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (freq[currentChar] != 0) {
                charFreq[count][0] = String.valueOf(currentChar);
                charFreq[count][1] = String.valueOf(freq[currentChar]);
                freq[currentChar] = 0;
                count++;
            }
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < count; i++) {
            System.out.println(charFreq[i][0] + " = " + charFreq[i][1]);
        }
    }
}
