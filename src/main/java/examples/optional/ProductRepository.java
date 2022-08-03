package examples.optional;

import java.util.Optional;

public class ProductRepository {
	public Optional<Product> findById(long id){
		Product product1 = new Product();
		//Optional<Product> optionalProduct = Optional.of(product1);
		Optional<Product> optionalProduct = Optional.empty();
		return optionalProduct;
	}

}
