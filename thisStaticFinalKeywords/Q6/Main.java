package Q6;

public class Main {
	public static void main(String[] args) {
        Vehicle.updateRegistrationFee(150.0);

        Vehicle vehicle1 = new Vehicle("Honest Raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Prince Danish", "SUV", "XYZ789");

        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
