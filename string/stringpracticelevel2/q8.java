package stringpracticelevel2;

import java.util.Scanner;

class q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter age for 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = scanner.nextInt();
        }
        String[][] voteStatus = new String[10][2];
        for (int i = 0; i < 10; i++) {
            voteStatus[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                voteStatus[i][1] = "false";
            } else if (ages[i] >= 18) {
                voteStatus[i][1] = "true";
            } else {
                voteStatus[i][1] = "false";
            }
        }
        System.out.println("Age\tCan Vote");
        for (int i = 0; i < 10; i++) {
            System.out.println(voteStatus[i][0] + "\t" + voteStatus[i][1]);
        }
    }
}
