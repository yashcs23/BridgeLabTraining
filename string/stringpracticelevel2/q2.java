package stringpracticelevel2;

import java.util.Scanner;

class q2 {
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
        int wordCount = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        wordCount++;
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String currentWord = "";
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != ' ') {
                currentWord += s.charAt(i);
            } else {
                if (currentWord.length() > 0) {
                    words[wordIndex++] = currentWord;
                }
                currentWord = "";
            }
        }
        if (currentWord.length() > 0) {
            words[wordIndex] = currentWord;
        }
        String[] splitWords = s.split(" ");
        boolean areEqual = true;
        if (words.length != splitWords.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals(splitWords[i])) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Are the arrays equal? " + areEqual);
    }
}
