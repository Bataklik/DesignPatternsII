package domain;

import java.time.LocalDate;

public class Profile {

	private String firstname;
	private String lastname;
	private LocalDate birthdate;


	public Profile(String fname, String lname, LocalDate bdate) {
		this.firstname = fname;
		this.lastname = lname;
		this.birthdate = bdate;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}
}