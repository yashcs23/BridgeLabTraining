package level1;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 1000.0;

    public CarRental() {
        this("Unknown", "Standard", 1);
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateCost() {
        return rentalDays * DAILY_RATE;
    }

    public void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Riya", "Honda City", 5);

        rental1.displayRental();
        rental2.displayRental();
    }
}
