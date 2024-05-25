package domain;

public class Thermostaat implements Apparaat {

	private boolean status;

	public void setActie() {
		this.status = !this.status;
	}

	public Thermostaat() {
		this.status = false;
	}
	@Override
	public String toString() {
		return "Thermostaat: " + status;
	}
}