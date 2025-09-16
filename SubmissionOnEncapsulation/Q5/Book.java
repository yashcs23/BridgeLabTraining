package Q5;

public class Book extends LibraryItem implements Reservable {
    private boolean reserved;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 21;
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (!reserved) {
            setBorrowerName(borrowerName);
            reserved = true;
        }
    }

    @Override
    public boolean checkAvailability() {
        return !reserved;
    }
}
