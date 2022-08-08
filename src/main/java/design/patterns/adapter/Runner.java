package design.patterns.adapter;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller(new Adapter());
		ClientInterface client = controller.getClient();
		Product product = null;
		client.addProduct(product );
	}

}
