package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> product = new ArrayList<>();
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<n; i++) {
			System.out.println("Product #"+i+"data:");
			System.out.print("Common, used or imported (c/u/i): ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			if (ch == 'i') {
				System.out.println("Custom fee: ");
				Double customsFee = sc.nextDouble();
				product.add(new ImportedProduct(name, price, customsFee)r);
			}
			if (ch == 'n') {
				product.add(new Product(name, price));
			}
			if (ch == 'u') {
				System.out.println("Manufacture date: ");
				Date manufactureDate = sdf1.parse(sc.nextLine());
				
			}
		}
		
		sc.close();
	}

}
