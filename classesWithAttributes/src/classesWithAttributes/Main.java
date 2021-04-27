package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2);
		
		Product product1 = new Product();
		product1.setName("Telefon");
		product1.setId(2);;
		product1.setDescription("Samsung Laptop");
		product1.setPrice(3000);
		product1.setStockAmount(6);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		productManager.Add(product1);
		System.out.println(product1.getKod());

	}

}
