package level1;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("2 States", "Chetan Bhagat", 400, true);
        LibraryBook b2 = new LibraryBook("Wings of Fire", "A.P.J Abdul Kalam", 500, true);

        b1.displayBook();
        b1.borrowBook();
        b1.borrowBook();
        b2.displayBook();
    }
}
