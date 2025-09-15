package Q4;

public class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

        public void display() {
            super.display();
            System.out.println("Fee: Rs. " + fee);
            System.out.println("Discount: " + discount + "%");
        }
}
