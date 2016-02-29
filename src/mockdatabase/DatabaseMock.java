package mockdatabase;
import java.util.HashMap;
import java.util.Map;

import model.Product;

public class DatabaseMock {

	static Map<Long, Product> products = new HashMap<>();

	static Product iPhone = new Product(55752L, "iPhone 6", 1800L);
	static Product samsungGalaxy = new Product(64455L, "Samsung Galaxy S5", 1500L);
	static Product tchiboCoffee = new Product(16615L, "Tchibo Coffee", 20L);
	static Product milkLaciate = new Product(66439L, "Milk Laciate", 3L);

	private DatabaseMock(){

	}

	static {
		products.put(iPhone.getId(), iPhone);
		products.put(samsungGalaxy.getId(), samsungGalaxy);
		products.put(tchiboCoffee.getId(), tchiboCoffee);
		products.put(milkLaciate.getId(), milkLaciate);
	}

	public static Product findById(String code) {
		return products.get(Long.parseLong(code));
	}

}
