package examples.optional;

import java.util.Optional;

public class ProductRepository {
	Optional<Product> findById(long id) {
		Optional<Product> optional = Optional.empty();
		Product product = new Product();
		optional = Optional.of(product);
		return optional;
	}
}
