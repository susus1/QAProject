package design.patterns.adapter;

import java.util.List;

public interface ProductRepository {
	void create(Product p);
	void delete(Product p);
	List<Product>selectAll();
}
