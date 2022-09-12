package mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new Mediator();
        mediator.registerComponent(new Button());
        mediator.registerComponent(new Fan(false));
        mediator.registerComponent(new PowerSupplier());

        System.out.println(mediator.getFan().isOn());
        mediator.press();
        System.out.println(mediator.getFan().isOn());
        mediator.press();
        System.out.println(mediator.getFan().isOn());
    }
}
