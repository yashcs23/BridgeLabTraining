package stringpracticelevel2;

import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count = 0;
        try {
            while (true) {
                s.charAt(count++);
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        System.out.println("User-defined length: " + count);
        System.out.println("Built-in length: " + s.length());
    }
}
