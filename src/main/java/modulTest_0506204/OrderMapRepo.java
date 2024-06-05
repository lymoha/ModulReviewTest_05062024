package modulTest_0506204;

import java.util.ArrayList;
import java.util.List;

public class OrderMapRepo implements OrderRepo {

    /**
     * Create a class OrderMapRepo through which we can place new orders.
     * This class should also implement the OrderRepo interface.
     * In the main method, create either the OrderMapRepo or the Order
     * ListRepo and pass it to the constructor of ShopService
     * (as a constructor parameter that uses the interface).
     */
    List<Order> orderListInOderMap = new ArrayList<>();

    public void addOrder(Order orderName) {
        orderListInOderMap.add(orderName);
    }

    public void removeOrder(Order orderName) {
        orderListInOderMap.remove(orderName);
    }

    public List<Order> getAllOrder() {
        return orderListInOderMap;
    }

    public Order getSingleOrder(String orderName) {
        for (Order odr : orderListInOderMap) {
            if (orderName.equals(odr.orderItems())) {
                return odr;
            }

        }
        return null;
    }
}