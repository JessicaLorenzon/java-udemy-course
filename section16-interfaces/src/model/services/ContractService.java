package model.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		List<Installment> installments = new ArrayList<>();

		double baseInstallmentValue = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			LocalDate nextDates = contract.getDate().plusMonths(i);

			double installmentValueTax = baseInstallmentValue + onlinePaymentService.interest(baseInstallmentValue, i);
			double amount = installmentValueTax + onlinePaymentService.paymentFee(installmentValueTax);
			installments.add(new Installment(nextDates, amount));
		}

		contract.setInstallments(installments);
	}

}
