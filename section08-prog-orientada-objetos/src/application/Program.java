package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.Rectangle;
import entities.Student;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		/*
		 * Programa para ler os valores da largura e altura de um retângulo. Em seguida,
		 * mostrar na tela o valor de sua área, perímetro e diagonal.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle = new Rectangle();

		System.out.println("Enter rectangle width and height: ");
		rectangle.heigth = sc.nextDouble();
		rectangle.width = sc.nextDouble();

		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

		/*
		 * Programa para ler os dados de um funcionário (nome, salário bruto e imposto).
		 * Em seguida, mostrar os dados do funcionário (nome e salário líquido). Em
		 * seguida, aumentar o salário do funcionário com base em uma porcentagem dada
		 * (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os
		 * dados do funcionário.
		 */

		Employee empl = new Employee();

		System.out.println("Nome: ");
		empl.name = sc.next();
		System.out.println("Gross Salary: ");
		empl.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		empl.tax = sc.nextDouble();

		System.out.println("Employee: " + empl);
		System.out.println();

		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		empl.increaseSalary(percentage);

		System.out.println("Updated data: " + empl);

		/*
		 * Programa para ler o nome de um aluno e as três notas que ele obteve nos três
		 * trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35
		 * cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o
		 * aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos
		 * pontos faltam para o aluno obter o mínimo para ser aprovado (que é 60% da
		 * nota).
		 */

		Student student = new Student();

		System.out.println("Nome: ");
		student.name = sc.nextLine();
		System.out.println("Nota 1: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		student.grade3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		/*
		 * Programa para ler a cotação do dólar, e depois um valor em dólares a ser
		 * comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar
		 * pelos dólares, considerando ainda que a pessoa terá que pagar 6% de IOF sobre
		 * o valor em dólar.
		 */

		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();

		double result = CurrencyConverter.dollarToReal(dollarPrice, amount);

		System.out.printf("Amount to be paid in reais = %.2f%n", result);

		sc.close();

	}

}
