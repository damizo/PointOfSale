package service;
import java.util.List;

import model.Product;

public class Printer {

	public void print(List<Product> listOfProducts) {

		System.out.println("---------RECEIPT---------");
		for (Product product : listOfProducts) {
			System.out.print(product.toString() + System.lineSeparator());
		}
		 System.out.println("-------------------------");

	}

}
