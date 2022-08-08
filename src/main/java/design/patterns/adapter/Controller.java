package design.patterns.adapter;

public class Controller {
	private ClientInterface client;

	public Controller(ClientInterface client) {
		this.client = client;
	}

	public ClientInterface getClient() {
		return client;
	}
	
	

}
