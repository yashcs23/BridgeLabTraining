package stringpracticelevel2;

import java.util.Scanner;

class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = 0;
        try {
            while (true) {
                s.charAt(length++);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
