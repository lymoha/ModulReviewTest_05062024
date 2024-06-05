package modulTest_0506204;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        OrderListRepo orderListRepo = new OrderListRepo();
        ShopeService shopeService = new ShopeService(orderListRepo);

        ProductRepo productRepo = new ProductRepo();
        productRepo.addProduct(new Product("Modul_ A", "73", "Mountain Bike", new BigDecimal("1900.999")));
        productRepo.addProduct(new Product("Modul_ B", "74", "Mountain Bike", new BigDecimal("1200.999")));
        productRepo.addProduct(new Product("Modul_ C", "75", "Mountain Bike Räder",
                new BigDecimal("120.999")));

        Order order = new Order("1001", "Saturn", "Waschmachine", 7);

        Order order02 = new Order("1011", "Saturn", "Huawei Notebook", 9);

        Order order03 = new Order("7101", "Saturn", "Staubsauger", 77);

        System.out.println(order);
        System.out.println(order02);
        System.out.println(order03);

        System.out.println(productRepo.getAllProduct());


    }


}
