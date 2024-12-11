package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int senha, x, y, combustivel, numero, n;

		// Programa que repita a leitura de uma senha até que ela seja válida. Para cada
		// leitura de senha
		// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
		// informada corretamente deve ser
		// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
		// a senha correta é o valor 2002.
		System.out.println("Digite a senha:");
		senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso Permitido");

		// programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de
		// pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
		// algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		// alguma).
		System.out.println("Digite as cordenadas (X, Y):");
		x = sc.nextInt();
		y = sc.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
				System.out.println();
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
				System.out.println();
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
				System.out.println();
			} else {
				System.out.println("Quarto Quadrante");
				System.out.println();
			}
			System.out.println("Digite as cordenadas (X, Y):");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Coordenada Nula");

		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		// preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da
		// seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
		// 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
		// deve ser solicitado um novo código (até
		// que seja válido). O programa será encerrado quando o código informado for o
		// número 4. Deve ser escrito a
		// mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		// tipo de combustível
		System.out.println("Digite o codigo do combustivel:");
		combustivel = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (combustivel != 4) {
			if (combustivel == 1) {
				alcool++;
			} else if (combustivel == 2) {
				gasolina++;
			} else if (combustivel == 3) {
				diesel++;
			}
			combustivel = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADA!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		// --------------------------------------------------------------------------------------------------------

		// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		// até X, um valor por linha, inclusive o
		// X, se for o caso.
		System.out.println("Digite um valor interiro entre 1 e 1000:");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		// que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
		// estão fora do intervalo, mostrando
		// essas informações (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo).
		System.out.println("Digite a quantidade de valores e em seguida os valores:");
		n = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		// Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		// seguir. Cada caso de teste consiste
		// de 3 valores reais, cada um deles com uma casa decimal. Apresente a média
		// ponderada para cada um destes
		// conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
		// valor tem peso 3 e o terceiro valor tem
		// peso 5.
		System.out.println("Digite o número de casos de teste:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("Digite o primeiro valor: ");
			double valor1 = sc.nextDouble();
			System.out.print("Digite o segundo valor: ");
			double valor2 = sc.nextDouble();
			System.out.print("Digite o terceiro valor: ");
			double valor3 = sc.nextDouble();

			double mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

			System.out.printf("Média Ponderada: %.1f%n", mediaPonderada);
		}

		// Fazer um programa para ler um número N. Depois leia N pares de números e
		// mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".
		System.out.println("Digite a quantidade de números:");
		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o primeiro número: ");
			double numero1 = sc.nextDouble();
			System.out.println("Digite o segundo número: ");
			double numero2 = sc.nextDouble();

			if (numero2 == 0) {
				System.out.println("Divisão Impossível!");
			} else {
				double divisao = numero1 / numero2;
				System.out.printf("Divisão: %.1f%n", divisao);
			}
		}

		// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		// N * (N-1) * (N-2) * (N-3) * ... * 1.
		// Lembrando que, por definição, fatorial de 0 é 1.
		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("Fatorial: " + fatorial);

		// Ler um número inteiro N e calcular todos os seus divisores.
		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}

		// Fazer um programa para ler um número inteiro positivo N. O programa deve
		// então mostrar na tela N linhas,
		// começando de 1 até N. Para cada linha, mostrar o número da linha, depois o
		// quadrado e o cubo do valor
		System.out.println("Digite um número: ");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);

			System.out.printf("%d %d %d%n", i, quadrado, cubo);

		}

		sc.close();

	}

}
