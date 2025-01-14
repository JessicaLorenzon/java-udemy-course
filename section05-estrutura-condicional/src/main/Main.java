package main;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numero, A, B, horaInicial, horaFinal, horaTotal, codigo, quantidade;
		double total, valor, x, y, salario, valorImposto;

		// Programa para ler um número inteiro, e depois dizer se este número é negativo
		// ou não.
		System.out.println("Digite um número inteiro:");
		numero = sc.nextInt();

		if (numero <= 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		// Programa para ler um número inteiro e dizer se este número é par ou ímpar.
		System.out.println("Digite um número inteiro:");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}

		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		// "Sao Multiplos" ou "Nao sao
		// Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
		// números devem poder ser digitados em
		// ordem crescente ou decrescente.
		System.out.println("Digite dois números inteiro:");
		A = sc.nextInt();
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São Múltiplos");
		} else {
			System.out.println("Não São Múltiplos");
		}

		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		// jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
		// máxima de 24 horas.
		System.out.println("Digite a hora inicial e a hora final do jogo (0-23h):");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();

		if (horaFinal > horaInicial) {
			horaTotal = horaFinal - horaInicial;
		} else if (horaFinal < horaInicial) {
			horaTotal = 24 - horaInicial + horaFinal;
		} else {
			horaTotal = 24;
		}

		System.out.println("O Jodo durou " + horaTotal + " hora(s)");

		// Programa que leia o código de um item e a quantidade deste item. A
		// seguir, calcule e mostre o valor da conta a pagar
		System.out.println("Digite o codigo do item e a quantidade:");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4;
		} else if (codigo == 2) {
			total = (quantidade * 4.5);
		} else if (codigo == 3) {
			total = (quantidade * 5.0);
		} else if (codigo == 4) {
			total = (quantidade * 2.0);
		} else {
			total = (quantidade * 1.5);
		}

		System.out.printf("Total: R$ %.2f%n", total);

		// Programa que leia um valor qualquer e apresente uma mensagem dizendo em qual
		// dos
		// seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se
		// encontra. Obviamente se o valor não estiver em
		// nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		System.out.println("Digite o valor:");
		valor = sc.nextDouble();

		if (valor < 0.0 || valor > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (valor <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (valor <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (valor <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		// Leia 2 valores com uma casa decimal (x e y), que devem representar as
		// coordenadas
		// de um ponto em um plano. A seguir, determine qual o quadrante ao qual
		// pertence o
		// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		// Se o ponto estiver na origem, escreva a mensagem “Origem”.
		System.out.println("Digite dois valores com uma casa decimal (x e y):");
		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		// Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa.
		// Em seguida, calcule e
		// mostre o valor que esta pessoa deve pagar de Imposto de Renda.
		System.out.println("Digite o valor do salario (duas casas decimais):");
		salario = sc.nextDouble();
		valorImposto = 0;

		if (salario > 2000.00) {
			if (salario > 3000.00) {
				valorImposto += 1000.00 * 0.08;
			} else {
				valorImposto += (salario - 2000.00) * 0.08;
			}
		}

		if (salario > 3000.00) {
			if (salario > 4500.00) {
				valorImposto += 1500.00 * 0.18;
			} else {
				valorImposto += (salario - 3000.00) * 0.18;
			}
		}

		if (salario > 4500.00) {
			valorImposto += (salario - 4500.00) * 0.28;
		}

		if (valorImposto == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("Imposto: R$ %.2f%n", valorImposto);
		}

		sc.close();

	}

}
