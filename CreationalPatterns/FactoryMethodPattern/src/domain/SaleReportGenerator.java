package domain;

public class SaleReportGenerator implements ReportGenerator {

	public Report createReport() {
		return new SaleReport();
	}

}