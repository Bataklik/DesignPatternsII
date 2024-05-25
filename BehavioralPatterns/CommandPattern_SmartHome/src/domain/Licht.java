package domain;

public class Licht implements Apparaat {

	private boolean status;

	public void setActie() {
		this.status = !this.status;
	}

	public Licht() {
		this.status = false;
	}

	@Override
	public String toString() {
		return "Licht: " + status;
	}
}