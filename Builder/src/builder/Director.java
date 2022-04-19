package builder;

import builder.builds.Builder;
import builder.model.Car;
import builder.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Director {
    private Builder builder;

    public Vehicle buildSUV() {
        builder.setSeats(5);
        builder.setDoors(5);
        builder.setEngine("V6");
        builder.setTransmission("automatic");
        builder.setTripComputer(true);
        return builder.getResult();
    }

    public Vehicle buildSportsCar() {
        builder.setSeats(2);
        builder.setDoors(2);
        builder.setEngine("V8");
        builder.setTransmission("manual");
        builder.setTripComputer(true);
        builder.setGPS(true);
        builder.setSunRoof(true);
        return builder.getResult();
    }

}
