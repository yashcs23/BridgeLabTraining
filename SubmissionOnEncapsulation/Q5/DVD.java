package Q5;

public class DVD extends LibraryItem implements Reservable {
    private boolean reserved;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    @Override
    public int getLoanDuration() {
        return 14;
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
