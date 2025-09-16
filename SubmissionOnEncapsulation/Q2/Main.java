package Q2;

public class Main {
    public static void printFinalPrice(Product[] products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            String taxDetails = "No tax";
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                taxDetails = ((Taxable) product).getTaxDetails();
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println(product.getName() + " | Price: " + product.getPrice() + " | Tax: " + taxDetails + " | Discount: " + discount + " | Final Price: " + finalPrice);
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[] {
            new Electronics("E101", "Smartphone", 20000, 2),
            new Clothing("C201", "T-Shirt", 800, "L"),
            new Groceries("G301", "Rice", 500, "2025-12-31")
        };
        printFinalPrice(products);
    }
}
