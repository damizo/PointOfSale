package main;

import java.util.Scanner;

import service.BarCodeScanner;
import service.LcdDisplay;
import service.Printer;

public class MainApp {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	BarCodeScanner barCodeScanner = new BarCodeScanner(new LcdDisplay(), new Printer());
	
	boolean start = true;

	System.out.println("Enter code of the product, if you want to stop, type 'exit'");

		while (start) {
			barCodeScanner.scan(sc.nextLine());
		}

		sc.close();

	}

}
