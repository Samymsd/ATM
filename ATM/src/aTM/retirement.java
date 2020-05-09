package aTM;

public class retirement extends aTM {

	@Override
	public void Transaction() {
		System.out.print("	Cuanto deseas retirar:  ");
		Retirement();
		if(retirement <= getBalance()) {
			transactions = getBalance();		
		    setBalance(transactions - retirement);
			
			System.out.println("--------------------------------------");
			System.out.println("	Retiraste : " + retirement);
			System.out.println("	Tu saldo actual es: " + getBalance());
			System.out.println("--------------------------------------");
			
		} else {
			System.out.println("-------------------");
			System.out.println("Saldo Insuficiente");
			System.out.println("------------------");
		}
	}
}
