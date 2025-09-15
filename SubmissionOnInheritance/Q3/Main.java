package Q3;

public class Main {
    public static void main(String[] args) {
           // Creating an order
           Order order = new Order("ORD123", "2025-09-15");
           System.out.println(order.getOrderStatus());

           // Creating a shipped order
           ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-09-14", "TRK987654");
           System.out.println(shippedOrder.getOrderStatus());

           // Creating a delivered order
           DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-09-13", "TRK123456", "2025-09-16");
           System.out.println(deliveredOrder.getOrderStatus());
    }
}
