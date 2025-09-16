package Q5;

public class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 7;
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
