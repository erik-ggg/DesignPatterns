package builder.builds;

import builder.model.CarManual;
import builder.model.Vehicle;

public class CarManualBuilder implements Builder {

    private CarManual carManual;

    public CarManualBuilder() {
        carManual = new CarManual();
    }

    @Override
    public void reset() {
        carManual = new CarManual();
    }

    @Override
    public void setSeats(int seats) {
        carManual.setSeats(seats);
    }

    @Override
    public void setDoors(int doors) {
        carManual.setDoors(doors);

    }

    @Override
    public void setEngine(String engine) {
        carManual.setEngine(engine);

    }

    @Override
    public void setTransmission(String transmission) {
        carManual.setTransmission(transmission);

    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        carManual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean GPS) {
        carManual.setGps(GPS);
    }

    @Override
    public void setSunRoof(boolean sunRoof) {
        carManual.setSunroof(sunRoof);
    }

    @Override
    public Vehicle getResult() {
        return carManual;
    }
}
