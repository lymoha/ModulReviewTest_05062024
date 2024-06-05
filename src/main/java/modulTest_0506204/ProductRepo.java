package modulTest_0506204;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    /**
     * Create a class ProductRepo that contains a list of Product objects.
     * <p>
     * Step 1: Create a record Product with the necessary attributes.
     * <p>
     * Step 2: Implement the ProductRepo class with a list to store products.
     * <p>
     * Step 3: Implement methods to add, remove, and get products (single product and all products).
     */
    List<Product> productList = new ArrayList<>();

    public void addProduct(Product productName) {

        productList.add(productName);
    }
  public Product addAllProduct(Product listAll){
        for (Product prd: productList){
            if (listAll.equals(prd.productNumber())){
                return prd;
            }
        }
        return  listAll;
  }

    public void removeProduct(Product productName) {
        productList.remove(productName);
    }

    public Product getSingleProduct(String id) {

        for (Product prd : productList) {
            if (id.equals(prd.productNumber())) {
                return prd;
            }

        }

        return null;
    }

    public List<Product> getAllProduct() {
        return productList;
    }

}
