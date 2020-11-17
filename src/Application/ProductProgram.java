package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProductProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat teste = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter the number of Products");
		int n = sc.nextInt();
		List<Product> produtos = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (1 + i) + "data:");
			System.out.println("Common,used or imported (c/u/i)");
			char n1 = sc.next().charAt(0);
			if (n1 == 'i') {
				System.out.println("Name:");
				String Name = sc.next();
				System.out.println("Price:");
				Double price = sc.nextDouble();
				System.out.println("Customs fee");
				Double fee = sc.nextDouble();
				produtos.add(new ImportedProduct(Name, price, fee));
			} else {
				if (n1 == 'c') {
					System.out.println("Name:");
					String Name = sc.next();
					System.out.println("Price:");
					Double price = sc.nextDouble();
					produtos.add(new Product(Name, price));
				} else {
					System.out.println("Name:");
					String Name = sc.next();
					System.out.println("Price:");
					Double price = sc.nextDouble();
					System.out.println("Manufacture Date:");
					Date teste1 = teste.parse(sc.next());
					produtos.add(new UsedProduct(Name, price, teste1));
				}
			}

		}
		System.out.println("PRICE TAGS:");
		for (Product c : produtos) {
			System.out.println(c.priceTag());
		}

	}
}
