package factorymethod.buttons;

public class HTMLButton implements BaseButton {
    @Override
    public void render() {
        System.out.println("HTML Button content...");
    }

    @Override
    public void onClick() {

    }
}
