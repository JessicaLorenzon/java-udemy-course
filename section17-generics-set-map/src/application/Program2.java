package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * Na contagem de votos de uma eleição, são gerados vários registros de votação
		 * contendo o nome do candidato e a quantidade de votos (formato .csv) que ele
		 * obteve em uma urna de votação. Fazer um programa para ler os registros de
		 * votação a partir de um arquivo, e daí gerar um relatório consolidado com os
		 * totais de cada candidato.
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> record = new LinkedHashMap();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String candidate = fields[0];
				int vote = Integer.parseInt(fields[1]);

				if (record.containsKey(candidate)) {
					int count = record.get(candidate);
					record.put(candidate, vote + count);
				} else {
					record.put(candidate, vote);
				}

				line = br.readLine();
			}

			for (String key : record.keySet()) {
				System.out.println(key + ": " + record.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
