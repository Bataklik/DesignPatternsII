package domain;

public class FinancialReportGenerator implements ReportGenerator {

    public Report createReport() {
        return new FinancialReport();
    }

}