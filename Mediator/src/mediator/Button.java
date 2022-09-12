package mediator;

public class Button implements Component {

    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void press() {
        mediator.press();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getType() {
        return "Button";
    }
}
