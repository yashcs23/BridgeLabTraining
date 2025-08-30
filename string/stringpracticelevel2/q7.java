package stringpracticelevel2;

import java.util.Scanner;

class q7 {
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
        int start = 0;
        while (start < length && s.charAt(start) == ' ') {
            start++;
        }
        int end = length - 1;
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }
        String trimmedString = "";
        for (int i = start; i <= end; i++) {
            trimmedString += s.charAt(i);
        }
        String builtInTrimmed = s.trim();
        boolean areEqual = true;
        if (trimmedString.length() != builtInTrimmed.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < trimmedString.length(); i++) {
                if (trimmedString.charAt(i) != builtInTrimmed.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Are the strings equal? " + areEqual);
    }
}
