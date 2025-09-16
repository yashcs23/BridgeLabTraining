package Q8;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C101", "Amit", 15);
        Vehicle bike = new Bike("B202", "Rahul", 10);
        Vehicle auto = new Auto("A303", "Suman", 8);

        double distance = 12.5;

        System.out.println(car.getVehicleDetails());
        System.out.println("Car Fare: " + car.calculateFare(distance));

        System.out.println(bike.getVehicleDetails());
        System.out.println("Bike Fare: " + bike.calculateFare(distance));

        System.out.println(auto.getVehicleDetails());
        System.out.println("Auto Fare: " + auto.calculateFare(distance));
    }
}
