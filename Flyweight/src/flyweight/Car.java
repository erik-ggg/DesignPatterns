package flyweight;

public class Car implements Vehicle {

    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
