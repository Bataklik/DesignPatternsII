package domain;

public class Deurvergrendeling implements Apparaat {

    private boolean status;

    public void setActie() {
        this.status = !this.status;
    }

    public Deurvergrendeling() {
        this.status = false;
    }
    @Override
    public String toString() {
        return "Deurvergrendeling: " + status;
    }
}