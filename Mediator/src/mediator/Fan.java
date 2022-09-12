package mediator;

public class Fan implements Component {

    private Mediator mediator;

    private boolean isOn;

    public Fan(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getType() {
        return "Fan";
    }
}
