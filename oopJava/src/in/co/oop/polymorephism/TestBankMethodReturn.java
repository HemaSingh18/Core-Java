package in.co.oop.polymorephism;

public class TestBankMethodReturn {

	public static void main(String[] args) {

		Bank[] banks = new Bank[3];
		banks[0] = Bank.getBank(1); // AxisBank()
		banks[1] = Bank.getBank(2); // ICICIbank()
		banks[2] = Bank.getBank(3); // HDFCbank()

		homeLoanEnquery(banks); //abstract method
	}

	public static void homeLoanEnquery(Bank[] banks) {

		for (Bank bank : banks) {
			System.out.println(bank.getName());
			System.out.println(bank.IntRate());
			System.out.println("====================");
		}

	}

}
