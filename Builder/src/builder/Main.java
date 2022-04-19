package builder;

import builder.builds.CarBuilder;
import builder.builds.CarManualBuilder;
import builder.model.Car;
import builder.model.CarManual;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        Director director = new Director(carBuilder);

        Car sportsCar = (Car) director.buildSportsCar();
        Car suvCar = (Car) director.buildSUV();

        System.out.println(sportsCar);
        System.out.println(suvCar);

        director.setBuilder(new CarManualBuilder());
        CarManual carManual = (CarManual) director.buildSportsCar();
        System.out.println(carManual.generateManual());

    }
}
