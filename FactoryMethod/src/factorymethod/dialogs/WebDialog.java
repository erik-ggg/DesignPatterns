package factorymethod.dialogs;

import factorymethod.buttons.BaseButton;
import factorymethod.buttons.HTMLButton;

public class WebDialog implements BaseDialog {

    @Override
    public BaseButton createButton() {
        return new HTMLButton();
    }
}
