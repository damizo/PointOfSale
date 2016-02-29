package service;
import java.util.ArrayList;
import java.util.List;

import model.Product;

public class Receipt {

	List<Product> products = new ArrayList<>();

	public void add(Product product) {

		products.add(product);

	}

	public List<Product> getAllProducts(){
		return products;
	}

	public Long getTotalPrice() {

		long totalPrice = 0L;

		
		for (Product product : products) {
		totalPrice += product.getPrice();
		}

		return totalPrice;

	}


}
