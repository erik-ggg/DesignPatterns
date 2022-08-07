package factorymethod.dialogs;

import factorymethod.buttons.BaseButton;
import factorymethod.buttons.WindowsButton;

public class WindowsDialog implements BaseDialog {
    @Override
    public BaseButton createButton() {
        return new WindowsButton();
    }
}
