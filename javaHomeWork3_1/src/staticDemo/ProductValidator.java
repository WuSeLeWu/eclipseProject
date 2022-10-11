package staticDemo;

public class ProductValidator {

	static {

	}

	public ProductValidator() {

	}

	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
}
