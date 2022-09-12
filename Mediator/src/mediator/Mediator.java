package mediator;

public class Mediator {

    private Button button;

    private Fan fan;

    private PowerSupplier powerSupplier;

    public void registerComponent(final Component component) {

        component.setMediator(this);
        switch (component.getType()) {
            case "PowerSupplier":
                this.powerSupplier = (PowerSupplier) component;
                break;
            case "Fan":
                this.fan = (Fan) component;
                break;
            case "Button":
                this.button = (Button) component;
                break;
            default:
                return;
        }
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public PowerSupplier getPowerSupplier() {
        return powerSupplier;
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    public void press() {
        if (fan.isOn()) {
            fan.turnOff();
        } else {
            fan.turnOn();
        }
    }

    public void start() {
        powerSupplier.turnOn();
    }

    public void stop() {
        powerSupplier.turnOff();
    }
}
