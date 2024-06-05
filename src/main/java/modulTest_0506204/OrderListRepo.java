package modulTest_0506204;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    /**
     * Create a class OrderListRepo that contains a list of Order objects.
     * Step 1: Create a record Order with the necessary attributes.
     * Step 2: Implement the OrderListRepo class with a list to store orders.
     * Step 3: Implement methods to add, remove, and (single order and all orders).
     */
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order orderName) {
        orderList.add(orderName);
    }

    public void removeOrder(Order orderName) {
        orderList.remove(orderName);
    }

    public List<Order> getAllOrder() {
        return orderList;
    }

    public Order getSingleOrder(String orderName) {
        for (Order ord : orderList) {
            if (orderName.equals(ord.orderItems())) {
                return ord;
            }

        }

        return null;
    }
}
