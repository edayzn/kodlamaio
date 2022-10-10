package WeekThreeHomeWorkOne.business;

import WeekThreeHomeWorkOne.entities.Customer;
import WeekThreeHomeWorkOne.entities.Person;

public class CustomerManager {

	private Customer customer;
	private CreditManager creditManager;

	public CustomerManager(Customer customer, CreditManager creditManager) {
		super();
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void save() {

		System.out.println("M��teri kaydedildi.");
	}

	public void delete() {
		System.out.println("M��teri silindi.");
	}

	public void giveCredit() {
		creditManager.calculate();
		creditManager.save();
		System.out.println("Kredi verildi.");
	}

}
