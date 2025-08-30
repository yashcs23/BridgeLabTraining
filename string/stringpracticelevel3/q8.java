package stringpracticelevel3;

import java.util.Scanner;

class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        boolean isAnagram = true;
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            int[] freq1 = new int[256];
            int[] freq2 = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                freq1[str1.charAt(i)]++;
                freq2[str2.charAt(i)]++;
            }
            for (int i = 0; i < 256; i++) {
                if (freq1[i] != freq2[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + isAnagram);
    }
}
