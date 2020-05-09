package aTM;

import java.util.Scanner;

public abstract class aTM {

	protected int transactions, retirement, deposit;
	private static int balance;
	Scanner entry = new Scanner(System.in);

	public void Operations() {
		int flat = 0;
		int selection = 0;

		do {
			do {
				System.out.println("Por favor seleccione una Opcion");
				System.out.println("	1. Consulta de Saldo");
				System.out.println("	2. Retiro de efectivo");
				System.out.println("	3. Deposito de efectivo");
				System.out.println("	4. Salir");
				selection = entry.nextInt();

				if (selection >= 1 && selection <= 4) {
					flat = 1;

				} else {
					System.out.println("---------------------------------------------------");
					System.out.println("	Opcion no disponible, vuelva  a intentar por favor");
					System.out.println("---------------------------------------------------");
				}
			} while (flat == 0);
			if (selection == 1) {
				aTM messenger = new querys();
				messenger.Transaction();

			} else if (selection == 2) {
				aTM messenger = new retirement();
				messenger.Transaction();

			} else if (selection == 3) {
				aTM messenger = new deposit();
				messenger.Transaction();

			} else if (selection == 4) {
				System.out.println("-----------------------");
				System.out.println("	Gracias vuelva pronto");
				System.out.println("-----------------------");
				flat = 2;

			}

		} while (flat != 2);

	}

	// Metodo para solicitar cantidad de retiro

	public void Retirement() {
		retirement = entry.nextInt();
	}

	// Metodo para solicitar el monto a depositar

	public void Deposit() {
		deposit = entry.nextInt();
	}

	// Metodo Abstracto
	public abstract void Transaction();

	// Metodos getter y setter
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
