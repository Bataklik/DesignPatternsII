package domain;

public class FinancialReport implements Report {

	public void generateReport() {
		System.out.println("Dit is het FinancialReport:");
		System.out.println("------------------------------");
		System.out.println("Balans: $1000000");
		System.out.println("Winst: $50000");
		System.out.println("Verlies: $10000");
		System.out.println("------------------------------");
	}

}