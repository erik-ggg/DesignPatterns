package builder.builds;

import builder.model.Vehicle;

public interface Builder {

    void reset();
    void setSeats(int seats);
    void setDoors(int doors);
    void setEngine(String engine);
    void setTransmission(String transmission);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean GPS);
    void setSunRoof(boolean sunRoof);
    Vehicle getResult();
}
