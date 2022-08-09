package examples.collections;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

    @Test
    public void hashSetWorksCorrectlyWithProducct(){
        Product product1 = new Product();
        product1.setId(1L);
        Product product2 = new Product();
        product2.setId(1L);

        HashSet<Product> products = new HashSet<>();
        products.add(product1);
        products.remove(product2);
        Assert.assertEquals(0, products.size());
    }


}
