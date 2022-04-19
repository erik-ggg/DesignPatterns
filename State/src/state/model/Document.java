package state.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import state.states.Draft;
import state.states.State;

@Setter
@Getter
@AllArgsConstructor
public class Document {

    private State state;

    public Document() {
        this.state = new Draft(this);
    }
}
