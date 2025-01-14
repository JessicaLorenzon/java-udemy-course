package application;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		/*
		 * Programa para ler nome, idade e altura de N pessoas, conforme exemplo.
		 * Depois, mostrar na tela a altura média das pessoas, e mostrar também a
		 * porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas
		 * caso houver.
		 */

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			}

		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}
		double mediaAlturas = soma / n;
		
		System.out.println();
		System.out.printf("\nAltura média = %.2f\n", mediaAlturas);
		
		int cont = 0;
		for (int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				cont++;
			}
		}
		double percent = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percent);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();

	}

}
