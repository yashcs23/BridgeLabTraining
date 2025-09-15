package Q3;

public class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
           // Call to the superclass constructor
           super(orderId, orderDate, trackingNumber);
           // Initialize delivery date
           this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
           // Returns the delivery status
           return "Order delivered on " + deliveryDate; 
    }
}
