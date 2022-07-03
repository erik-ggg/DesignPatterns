package abstractfactory;

public class ModernFurnitureFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        return new Chair("Modern Chair");
    }

    @Override
    public Sofa createSofa() {
        return new Sofa("Modern Sofa");
    }
}
