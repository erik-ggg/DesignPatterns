package state;

import state.model.Document;

public class Main {

    public static void main(String[] args) {

        Document document = new Document();
        document.getState().render();

        document.getState().publish();
        document.getState().render();
        document.getState().publish();

    }
}
