package level1;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayCircle() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Radius: %.2f, Area: %.2f, Circumference: %.2f%n", radius, area, circumference);
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(2.5);

        defaultCircle.displayCircle();
        customCircle.displayCircle();
    }
}
