package builder.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vehicle {
    private int seats;
    private int doors;
    private String engine;
    private String transmission;
    private boolean tripComputer;
    private boolean gps;
    private boolean sunroof;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", doors=" + doors +
                ", engine='" + engine + '\'' +
                ", transmission='" + transmission + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                ", sunroof=" + sunroof +
                '}';
    }
}
