package stringpracticelevel2;

import java.util.Scanner;

class q4 {
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
        String[][] wordLengthArray = new String[wordCount][2];
        for (int i = 0; i < wordCount; i++) {
            String word = words[i];
            int wordLength = 0;
            try {
                while (true) {
                    word.charAt(wordLength++);
                }
            } catch (StringIndexOutOfBoundsException e) {
            }
            wordLengthArray[i][0] = word;
            wordLengthArray[i][1] = String.valueOf(wordLength);
        }
        String shortestWord = "";
        String longestWord = "";
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        for (int i = 0; i < wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int len = Integer.parseInt(wordLengthArray[i][1]);
            if (len < minLength) {
                minLength = len;
                shortestWord = word;
            }
            if (len > maxLength) {
                maxLength = len;
                longestWord = word;
            }
        }
        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);
    }
}
