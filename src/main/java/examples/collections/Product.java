package examples.collections;

public class Product {
    private long id;
    private String name;
    private double costPrice;
    private double retailPrice;
    
    

    /**
     * equal if same id
     */
	@Override
	public boolean equals(Object obj) {
		return ((Product)obj).id == id;
	}
	
	

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (int)id;
	}



	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

}
