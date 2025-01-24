package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		/*
		 * Programa para ler os dados de N produtos (N fornecido pelo usuário). Ao
		 * final, mostrar a etiqueta de preço de cada produto na mesma ordem em que
		 * foram digitados
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				Product imp = new ImportedProduct(name, price, customsFee);
				list.add(imp);
			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				Product prod = new UsedProduct(name, price, manufactureDate);
				list.add(prod);
			} else {
				Product prod = new Product(name, price);
				list.add(prod);
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}

		sc.close();

	}

}
