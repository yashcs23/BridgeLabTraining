package controlflowpracticelevel3;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();   // weight in kg
        double h = sc.nextDouble();   // height in cm
        h = h / 100;                  // convert cm → m
        double bmi = w / (h * h);
        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
