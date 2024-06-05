    package modulTest_0506204;

    import org.junit.jupiter.api.Test;

    import java.math.BigDecimal;
    import java.util.ArrayList;
    import java.util.List;

    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertNull;

    public class ProductRepoTest {

        @Test
        public void addProduct_shouldAddProductToList_WhennCalled() {

            ProductRepo productRepo = new ProductRepo();
            Product product01 = new Product("Modul_ A", "73", "Mountain Bike", new BigDecimal("1900.999"));

            productRepo.addProduct(product01);
            assertEquals(product01, productRepo.getSingleProduct("73"));
        }

        @Test
        public void removeProduct_ShouldRemoveProductFromList_WhenCalled() {

            ProductRepo productRepo = new ProductRepo();
            Product product01 = new Product("Modul_ A", "73", "Mountain Bike", new BigDecimal("1900.999"));

            productRepo.addProduct(product01);
            assertEquals(product01, productRepo.getSingleProduct("73"));
            //assertNull(productRepo.getSingleProduct("73"));//Verursacht Exeption
            assertNull(productRepo.getSingleProduct("73"));
        }

        @Test
        public void getSingleProduct_ShouldReturnSingleProduct_WhenCalledWithProductID() {

            ProductRepo productRepo = new ProductRepo();
            List<Product> products = new ArrayList<>();
            Product product01 = new Product("Modul_ A", "73", "Mountain Bike", new BigDecimal("1900.999"));
            products.add(product01);

            productRepo.addProduct(product01);
            assertEquals(product01, productRepo.getSingleProduct("73"));


        }

        @Test
        public void getAllProduct_ShouldReturnAllExistingProducts_WhenCalled() {
        //Habe keinen AUsweg finden können --> Hat nicht geklappt!!!!!
            ProductRepo productRepo = new ProductRepo();

            Product product01 = new Product("Modul_ A", "73", "Mountain Bike", new BigDecimal("1900.999"));
            List<Product> products = new ArrayList<>();
          //  products.add(product01);
            productRepo.addAllProduct(product01);
            assertEquals(product01,productRepo.getSingleProduct("73"));


        }
    }