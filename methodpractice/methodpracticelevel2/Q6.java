package methodpracticelevel2;

import java.util.Scanner;

class Q6 {
    public static double convertFToC(double f) { return (f - 32) * 5 / 9; }
    public static double convertCToF(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double p) { return p * 0.453592; }
    public static double convertKgToPounds(double k) { return k * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
    public static void main(String[] args) {
        System.out.println("100 F = " + convertFToC(100) + " C");
    }
}
