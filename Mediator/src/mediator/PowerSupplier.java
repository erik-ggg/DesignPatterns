package mediator;

public class PowerSupplier implements Component {

    private Mediator mediator;

    public void turnOn() {
        System.out.println("Power supplier ON");
    }

    public void turnOff() {
        System.out.println("Power supplier OFF");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getType() {
        return "PowerSupplier";
    }
}

