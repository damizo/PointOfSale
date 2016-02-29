package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import model.Product;
import service.Receipt;

public class ReceiptTest {

	@Test
	public void testAdd() {
		Receipt receipt = new Receipt();
		Product product = new Product(1L, "test", 250L); //

		receipt.add(product);

		List<Product> results = receipt.getAllProducts();

		assertEquals(1, results.size());
	}

	@Test
	public void testGetAllProducts() {
		Receipt receipt = new Receipt();
		Product product = new Product(5L, "test", 400L);
		Product product2 = new Product(5L, "test", 400L);

		receipt.add(product);
		receipt.add(product2);

		assertEquals(product, receipt.getAllProducts().get(0));
		assertEquals(product2, receipt.getAllProducts().get(1));

	}

	@Test
	public void testGetTotalPrice() {
		Receipt receipt = new Receipt();
		Long expectedPrice = 250L;
		Product product = new Product(1L, "test", expectedPrice);

		receipt.add(product);


		assertEquals(expectedPrice, receipt.getTotalPrice());
	}

}
