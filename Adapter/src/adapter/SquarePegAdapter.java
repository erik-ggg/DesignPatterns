package adapter;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class SquarePegAdapter extends RoundPeg {

    private SquarePeg squarePeg;

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }
}
