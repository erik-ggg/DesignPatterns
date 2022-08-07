package flyweight;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache
            = new HashMap<>();

    public static Vehicle createVehicle(Color color) {
        return vehiclesCache.computeIfAbsent(color, newColor -> {
            Engine newEngine = new Engine("V8");
            return new Car(newEngine, newColor);
        });
    }
}
