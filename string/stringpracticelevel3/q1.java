package stringpracticelevel3;

import java.util.Scanner;

class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] membersData = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            membersData[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height (cm): ");
            membersData[i][1] = sc.nextDouble();
        }
        String[][] bmiData = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = membersData[i][0];
            double heightCm = membersData[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status = "";
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }
            bmiData[i][0] = String.valueOf(weight);
            bmiData[i][1] = String.valueOf(heightCm);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(bmiData[i][1] + "\t\t" + bmiData[i][0] + "\t\t" + bmiData[i][2] + "\t\t" + bmiData[i][3]);
        }
    }
}
