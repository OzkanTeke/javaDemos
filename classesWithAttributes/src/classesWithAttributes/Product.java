package classesWithAttributes;

public class Product {
	//product attributes -> single responsibility
	
	//constructor
	public Product(int id, String name, String description, double price, int stockAmonut) {
		System.out.println("Yapýcý blok çalýþtý.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmonut;
	}
	
	public Product() {
		
	}
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	public int getId() { //getter
		return id;
	}
	
	public void setId(int id) {  //setter
		this.id = id;
	}
	
	public String getName() { //getter
		return name;
	}
	
	public void setName(String name) {  //setter
		this.name = name;
	}
	
	public String getDescription() { //getter
		return description;
	}
	
	public void setDescription(String description) {  //setter
		this.description = description;
	}
	
	public double getPrice() { //getter
		return price;
	}
	
	public void setPrice(double price) {  //setter
		this.price = price;
	}
	
	public int getStockAmount() { //getter
		return stockAmount;
	}
	
	public void setStockAmount(int stockAmount) {  //setter
		this.stockAmount = stockAmount;
	}
	
	public String getKod() { //getter
		return this.name.substring(0, 1) + id;
	}


}
