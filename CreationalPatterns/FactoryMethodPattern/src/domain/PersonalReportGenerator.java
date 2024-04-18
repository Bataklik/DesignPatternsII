package domain;

public class PersonalReportGenerator implements ReportGenerator {

	public Report createReport() {
		return new PersonalReport();
	}

}