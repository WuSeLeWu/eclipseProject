package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Birinci yapı yolu
		Product product=new Product(2, "Laptop","Apple Laptop",7000,5,"Siyah");
		
		//İkinci yapı yolu
		/*
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setColor("Beyaz");
		product.getKod();
		*/
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());  
		

	}

}
