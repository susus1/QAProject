package design.patterns.adapter;


public class Adapter implements ClientInterface {

	private ProductRepository repository = new MySqlProductRepository();

	public void addProduct(Product p){
		repository.create(p);
	}

	public void removeProduct(Product p){
		repository.delete(p);
	}

}