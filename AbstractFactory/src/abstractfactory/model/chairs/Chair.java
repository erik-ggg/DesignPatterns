package abstractfactory.model.chairs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Chair {

    public Chair(String name) {
        this.name = name;
    }

    private String name;
    private String material;
    private int cost;
}
