package state.states;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import state.model.Document;

@Getter
@Setter
@AllArgsConstructor
public class Draft implements State {

    private Document document;
    @Override
    public void render() {
        System.out.println("Rendering document in draft state");
    }

    @Override
    public void publish() {
        this.document.setState(new Published(this.document));
    }
}
