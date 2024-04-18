package ui;

import domain.FinancialReportGenerator;
import domain.PersonalReportGenerator;
import domain.Report;
import domain.SaleReportGenerator;

public class Client {

    private PersonalReportGenerator personalReportGenerator;
    private SaleReportGenerator saleReportGenerator;
    private FinancialReportGenerator financialReportGenerator;

    public static void main(String[] args) {
        new Client().run();
    }

    public void run() {
        //? Personal report
        personalReportGenerator = new PersonalReportGenerator();
        Report report = personalReportGenerator
                .createReport();
        report.generateReport();

        //?Sale report
        saleReportGenerator = new SaleReportGenerator();
        report = saleReportGenerator
                .createReport();
        report.generateReport();

        //?Financial report
        financialReportGenerator = new FinancialReportGenerator();
        report = financialReportGenerator
                .createReport();
        report.generateReport();

    }
}