package aTM;

public class deposit extends aTM {

	@Override
	public void Transaction() {
		System.out.println("	Cuanto desea depositar ");
		Deposit();

		transactions = getBalance();
		setBalance(transactions + deposit);
		System.out.println("-----------------------------------");
		System.out.println("	Depositaste :" + deposit);
		System.out.println("	Tu saldo actual es:" + getBalance());
		System.out.println("-----------------------------------");
	}
}