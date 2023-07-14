package Java_Version_8.Automation;

public class Zoomcars {
	
	private String model;
	private String name;
	private long price;
	
	public Zoomcars(String model, String name, int price) {
		super();
		this.model = model;
		this.name = name;
		this.price = price;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "model=" + model + ", name=" + name + ", price=" + price;
	}
}