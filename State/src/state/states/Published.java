package state.states;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import state.model.Document;

@Getter
@Setter
@AllArgsConstructor
public class Published implements State {

    private Document document;

    @Override
    public void render() {
        System.out.println("Rendering document as published");
    }

    @Override
    public void publish() {
        System.out.println("Document is already published");
    }
}
