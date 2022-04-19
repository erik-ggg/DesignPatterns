package builder.builds;

import builder.model.Car;
import builder.model.Vehicle;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setDoors(int doors) {
        car.setDoors(doors);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTransmission(String transmission) {
        car.setTransmission(transmission);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean GPS) {
        car.setGps(GPS);
    }

    @Override
    public void setSunRoof(boolean sunRoof) {
        car.setSunroof(sunRoof);
    }

    public Vehicle getResult() {
        return car;
    }
}
