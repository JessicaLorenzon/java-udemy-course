package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		/*
		 * Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois,
		 * mostrar um sumário do pedido. Nota: o instante do pedido deve ser o instante
		 * do sistema: new Date()
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY):");
		Date birthDate = sdf.parse(sc.nextLine());

		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data");
		System.out.println("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(new Date(), status, client);

		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i + 1) + " item data");
			System.out.println("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price:");
			double productPrice = sc.nextDouble();

			Product product = new Product(productName, productPrice);

			System.out.println("Quantity:");
			int quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(quantity, productPrice, product);

			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("ORDER SUMMARY");
		System.out.println(order);

		sc.close();

	}

}
