package adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoundHole {

    private double radius;

    public boolean fits(final RoundPeg roundPeg) {
        return radius >= roundPeg.getRadius();
    }

}
