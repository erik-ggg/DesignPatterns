package abstractfactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sofa {

    public Sofa(String name) {
        this.name = name;
    }

    private String name;
    private String material;
    private int cost;
    private int seats;

}
