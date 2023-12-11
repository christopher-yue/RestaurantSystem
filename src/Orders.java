import java.util.ArrayList;
import java.util.List;

public class Orders {
    private final List<OrderItem> orderItems = new ArrayList<>();

    // Get order items
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    // Add order item
    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }
}
