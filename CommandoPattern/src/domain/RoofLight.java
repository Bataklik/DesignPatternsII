package domain;

public class RoofLight implements ILight {
    private boolean isOn;

    @Override
    public void switchLight() {
        this.isOn = !this.isOn;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
