package Q6;

public class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double nonVegCharge;

    public NonVegItem(String itemName, double price, int quantity, double nonVegCharge) {
        super(itemName, price, quantity);
        this.discount = 0;
        this.nonVegCharge = nonVegCharge;
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - (total * discount / 100);
    }

    @Override
    public void applyDiscount(double percent) {
        this.discount = percent;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: " + discount + "%";
    }
}
