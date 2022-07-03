package abstractfactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new Chair("Victorian chair");
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Victorian sofa");
    }
}
