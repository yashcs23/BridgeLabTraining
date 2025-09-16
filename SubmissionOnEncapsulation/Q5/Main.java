package Q5;

public class Main {
    public static void processItems(LibraryItem[] items) {
        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails() + " | Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                boolean available = ((Reservable) item).checkAvailability();
                System.out.println("Available: " + (available ? "Yes" : "No"));
                if (available) {
                    ((Reservable) item).reserveItem("John Doe");
                    System.out.println("Reserved for: " + item.getBorrowerName());
                }
            }
        }
    }

    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[] {
            new Book("B101", "Java Programming", "James Gosling"),
            new Magazine("M202", "Tech Monthly", "Jane Smith"),
            new DVD("D303", "Inception", "Christopher Nolan")
        };
        processItems(items);
    }
}
