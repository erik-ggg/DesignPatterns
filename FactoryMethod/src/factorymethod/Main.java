package factorymethod;

import factorymethod.buttons.BaseButton;
import factorymethod.dialogs.BaseDialog;
import factorymethod.dialogs.WebDialog;
import factorymethod.dialogs.WindowsDialog;

public class Main {

    public static void main(String[] args) {

        BaseDialog webDialog = new WebDialog();
        BaseDialog windowsDialog = new WindowsDialog();

        BaseButton webButton = webDialog.createButton();
        BaseButton windowsButton = windowsDialog.createButton();

        webButton.render();
        windowsButton.render();
    }
}
