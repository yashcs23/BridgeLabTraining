package Q3;

public class Main {
    public static void printRentalAndInsurance(Vehicle[] vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            double insuranceCost = 0;
            String insuranceDetails = "No insurance";
            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
                insuranceDetails = ((Insurable) vehicle).getInsuranceDetails();
            }
            System.out.println(vehicle.getType() + " | Number: " + vehicle.getVehicleNumber() + " | Rental Cost: " + rentalCost + " | Insurance: " + insuranceDetails + " | Insurance Cost: " + insuranceCost);
        }
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[] {
            new Car("CAR123", 1500, "CARPOL1001"),
            new Bike("BIKE456", 500, "BIKEPOL2002"),
            new Truck("TRUCK789", 3000, "TRUCKPOL3003")
        };
        printRentalAndInsurance(vehicles, 5);
    }
}
