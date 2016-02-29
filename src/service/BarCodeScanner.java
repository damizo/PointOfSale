package service;

import mockdatabase.DatabaseMock;
import model.Product;

public class BarCodeScanner {

	private static final String EXIT = "exit";
	private LcdDisplay lcdDisplay;
	private Printer printer = new Printer();
	private Receipt receipt = new Receipt();

	public BarCodeScanner(LcdDisplay lcdDisplay, Printer printer) {
		this.lcdDisplay = lcdDisplay;
		this.printer = printer;
	}

	public void scan(String code) {

		if (code.equals("")) {
			lcdDisplay.print("Invalid bar-code!");
			return;
		}

		if (code.equals(EXIT)) {
			printer.print(receipt.getAllProducts());
			lcdDisplay.print("Total price: " + receipt.getTotalPrice());

			receipt = new Receipt();
			return;
		}

		Product currentProduct = DatabaseMock.findById(code);

		if (currentProduct != null) {
			lcdDisplay.print(currentProduct.toString());
			receipt.add(currentProduct);
			return;
		}

		if (!code.equals(currentProduct)) {
			lcdDisplay.print("Product not found!");
			return;
		}
	}

}
