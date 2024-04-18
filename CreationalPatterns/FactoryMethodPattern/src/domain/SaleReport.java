package domain;

public class SaleReport implements Report {

	@Override
	public void generateReport() {
		System.out.println("Dit is het SaleReport:");
		System.out.println("------------------------------");
		System.out.println("Datum: 2024-04-20");
		System.out.println("Totaal aantal verkopen: 100");
		System.out.println("Totale omzet: $10000");
		System.out.println("------------------------------");
	}

}