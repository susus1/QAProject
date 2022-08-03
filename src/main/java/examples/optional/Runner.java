package examples.optional;

import java.util.Optional;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductRepository repository = new ProductRepository();
		Optional<Product> optional = repository.findById(1L);
		if(optional.isPresent()) {
			Product p = optional.get();
			System.out.println("Product found");
		}
		else {
			System.out.println("Not found");
		}
		
	}

}
