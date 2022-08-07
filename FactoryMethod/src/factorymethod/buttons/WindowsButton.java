package factorymethod.buttons;

public class WindowsButton implements BaseButton {

    @Override
    public void render() {
        System.out.println("Windows Button content...");
    }

    @Override
    public void onClick() {

    }
}
