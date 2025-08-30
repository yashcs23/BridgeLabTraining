package stringpracticelevel2;

import java.util.Scanner;

class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = 0;
        try {
            while (true) {
                s.charAt(length++);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        String[][] charTypes = new String[length][2];
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            String type = "Not a Letter";
            if (c >= 'A' && c <= 'Z') {
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    type = "Vowel";
                } else {
                    type = "Consonant";
                }
            } else if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    type = "Vowel";
                } else {
                    type = "Consonant";
                }
            }
            charTypes[i][0] = String.valueOf(c);
            charTypes[i][1] = type;
        }
        System.out.println("Character\tType");
        for (int i = 0; i < length; i++) {
            System.out.println(charTypes[i][0] + "\t\t" + charTypes[i][1]);
        }
    }
}
