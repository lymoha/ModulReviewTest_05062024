package modulTest_0506204;

public class ShopeService {
    /**
     * Create a class ShopService through which we can place new orders.
     * Step 1: Implement a method to place a new order.
     * <p>
     * Step 2: Check if the ordered products exist. If not, print a System.out.println message.
     */
    private final OrderListRepo orderListRepo;
    //OrderListRepo orderListRepo = new OrderListRepo();

    public ShopeService(OrderListRepo orderListRepo) {
        this.orderListRepo = orderListRepo;
    }

    public void placeNewOrder(Order orderName) {
        orderListRepo.addOrder(orderName);
    }

}
