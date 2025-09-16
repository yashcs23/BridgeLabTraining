package Q6;

public class Main {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10);
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);
        }
    }

    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[] {
            new VegItem("Paneer Tikka", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1, 50)
        };
        processOrder(order);
    }
}
