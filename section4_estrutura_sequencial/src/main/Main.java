package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.println(product1 + "which price is $ " + price1);
		System.out.println(product2 + "which price is $ " + price2);
		System.out.println();

		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();

		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		System.out.println();

		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		System.out.println("-----------------------------------------------------");

		// -------------------------------------------------------------------------------------------
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159f;
		int a, b, soma, A, B, C, D, diferenca, numero, horasTrabalhadas, codigoPeca1, codigoPeca2, quantidadePeca1,
				quantidadePeca2;
		double raio, area, valorPorHora, salario, valorUnitarioPeca1, valorUnitarioPeca2, total;
		float numero1, numero2, numero3, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

		// Programa para ler dois valores inteiros, e depois mostrar na tela a soma
		// desses números com uma
		// mensagem explicativa.
		System.out.println("Insira dois numeros inteiros:");
		a = sc.nextInt();
		b = sc.nextInt();

		soma = a + b;

		System.out.println("Soma = " + soma);

		// Programa para ler o valor do raio de um círculo, e depois mostrar o valor da
		// área deste círculo com quatro
		// casas decimais.
		System.out.println("Insira o raio do círculo:");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2);

		System.out.printf("Área do círculo = %.4f%n", area);

		// Programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e
		// mostre a diferença do produto
		// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
		// D).
		System.out.println("Insira quatro valores inteiros:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		diferenca = ((A * B) - (C * D));

		System.out.println("Diferença = " + diferenca);

		// Programa que leia o número de um funcionário, seu número de horas
		// trabalhadas, o valor que recebe por
		// hora e calcula o salário desse funcionário. A seguir, mostre o número e o
		// salário do funcionário, com duas casas
		// decimais
		System.out.println("Insira o numero, total de horas trabalhadas e o valor por hora:");
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorPorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorPorHora;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		// Programa para ler o código de uma peça 1, o número de peças 1, o valor
		// unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago
		System.out.println("Insira o codigo da peça 1, sua quantidade e seu valor unitário");
		codigoPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorUnitarioPeca1 = sc.nextDouble();

		System.out.println("Insira o codigo da peça 2, sua quantidade e seu valor unitário");
		codigoPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorUnitarioPeca2 = sc.nextDouble();

		total = (quantidadePeca1 * valorUnitarioPeca1) + (quantidadePeca2 * valorUnitarioPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		// Programa que leia três valores com ponto flutuante de dupla precisão: A, B e
		// C. Em seguida, calcule e
		// mostre:a) a área do triângulo retângulo que tem A por base e C por altura; b)
		// a área do círculo de raio C. (pi = 3.14159);
		// c) a área do trapézio que tem A e B por bases e C por altura; d) a área do
		// quadrado que tem lado B; e) a área do retângulo que tem lados A e B.
		System.out.println("Insira três valores decimais: ");
		numero1 = sc.nextFloat();
		numero2 = sc.nextFloat();
		numero3 = sc.nextFloat();

		areaTriangulo = numero1 * numero3 / 2;
		areaCirculo = (float) (pi * Math.pow(numero3, 2));
		areaTrapezio = (numero1 + numero2) * numero3 / 2;
		areaQuadrado = (float) Math.pow(numero2, 2);
		areaRetangulo = numero1 * numero2;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		sc.close();

	}

}
