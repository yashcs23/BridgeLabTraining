package Q8;

public class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int s, String m) {
        super(s, m);
    }
    public void charge() {
        System.out.println("Charging electric vehicle");
    }
}
