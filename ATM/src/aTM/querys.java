package aTM;

public class querys extends aTM {

	@Override
	public void Transaction() {
		System.out.println("--------------------------------------- ");
		System.out.println("	Tu saldo actual es : " + getBalance());
		System.out.println("----------------------------------------");

	}

}
