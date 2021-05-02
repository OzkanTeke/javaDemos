package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "Mouse";
		manager.add(product);
		
		DatabaseHelper.Connection.createConnection();  // tavsiye edilmez databasehelper da crud ve conncetion iþlemleri
													   //ayrý olsa daha iyi olur
	}

}
