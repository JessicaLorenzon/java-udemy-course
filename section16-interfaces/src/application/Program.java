package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		/*
		 * A empresa utiliza um serviço de pagamento online para realizar o pagamento
		 * das parcelas. Os serviços de pagamento online tipicamente cobram um juro
		 * mensal, bem como uma taxa por pagamento. Por enquanto, o serviço contratado
		 * pela empresa é o do Paypal, que aplica juros simples de 1% a cada parcela,
		 * mais uma taxa de pagamento de 2%. Fazer um programa para ler os dados de um
		 * contrato (número do contrato, data do contrato, e valor total do contrato). .
		 * Em seguida, o programa deve ler o número de meses para parcelamento do
		 * contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),
		 * sendo a primeira parcela a ser paga um mês após a data do contrato, a segunda
		 * parcela dois meses após o contrato e assim por diante. Mostrar os dados das
		 * parcelas na tela.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Entre os dados do contrato");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int months = sc.nextInt();

		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, months);

		System.out.println();
		System.out.println("Parcelas");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}

		sc.close();

	}
}
