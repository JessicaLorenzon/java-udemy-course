package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		/*
		 * Programa que leia N números reais e armazene-os em um vetor. Em seguida: -
		 * Imprimir todos os elementos do vetor - Mostrar na tela a soma e a média dos
		 * elementos do vetor.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar?");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero:");
			vect[i] = sc.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i];
		}

		double media = soma / vect.length;

		System.out.println("VALORES = ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f%n", vect[i]);
		}

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

		sc.close();
	}

}
