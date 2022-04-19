package builder.model;

public class CarManual extends Vehicle {

    public String generateManual() {
        return "This manual is for the car with " + getDoors() + " doors" +
                ", " + getSeats() + " seats" +
                ", " + getEngine() + " engine" +
                ", " + getTransmission() + " transmission";
    }
}
