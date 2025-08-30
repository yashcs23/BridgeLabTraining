package stringpracticelevel3;

import java.util.Scanner;

class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int length = 0;
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
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
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        System.out.print("Unique characters: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
