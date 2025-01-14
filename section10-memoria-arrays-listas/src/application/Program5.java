package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program5 {

	public static void main(String[] args) {
		/*
		 * Programa para ler um número inteiro N e depois os dados (id, nome e salario)
		 * de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o
		 * aumento de X por cento no salário de um determinado funcionário. Para isso, o
		 * programa deve ler um id e o valor X. Se o id informado não existir, mostrar
		 * uma mensagem e abortar a operação. Ao final, mostrar a listagem atualizada
		 * dos funcionários.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Emplyoee #" + i + ":");

			System.out.println("Id: ");
			int id = sc.nextInt();

			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			list.add(new Employee(id, name, salary));
		}

		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of employees: ");
		for (Employee obj : list) {
			System.out.println(obj);
		}

		sc.close();

	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
