package modulTest_0506204;

import java.util.List;

public interface OrderRepo {
    /**
     *
     Step 1: Create an OrderRepo interface with the methods from
     the OrderListRepo (add, remove, and getSingle, getAll).
     */
    void addOrder(Order orderName);

    void removeOrder(Order orderName);

    List<Order> getAllOrder();
    Order getSingleOrder(String orderName);

}
