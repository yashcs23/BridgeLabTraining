package Q7;

public class RestaurantMain {
    public static void main(String[] args) {
        Chef chef = new Chef("Ravi", 101);
        Waiter waiter = new Waiter("Sunil", 201);
        chef.performDuties();
        waiter.performDuties();
    }
}
