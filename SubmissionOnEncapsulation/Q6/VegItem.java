package Q6;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Discount: " + discount + "%";
    }
}
