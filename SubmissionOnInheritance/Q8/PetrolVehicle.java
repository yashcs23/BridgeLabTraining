package Q8;

public class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int s, String m) {
        super(s, m);
    }
    public void refuel() {
        System.out.println("Refueling petrol vehicle");
    }
}
