package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "Ahmet";
		product.price = 4500;

		manager.add(product);

		// Inner Class Kullanımı
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();

	}

}
