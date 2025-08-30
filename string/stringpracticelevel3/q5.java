package stringpracticelevel3;

import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] uniqueChars = new char[str.length()];
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueChars[uniqueCount] = str.charAt(i);
                uniqueCount++;
            }
        }
        char[] uniqueResult = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueResult[i] = uniqueChars[i];
        }
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        String[][] charFreq = new String[uniqueResult.length][2];
        for (int i = 0; i < uniqueResult.length; i++) {
            char charToFind = uniqueResult[i];
            charFreq[i][0] = String.valueOf(charToFind);
            charFreq[i][1] = String.valueOf(freq[charToFind]);
        }
        System.out.println("Character frequencies:");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println(charFreq[i][0] + " = " + charFreq[i][1]);
        }
    }
}
