package abstractfactory;

import abstractfactory.model.chairs.Chair;
import abstractfactory.model.chairs.ModernChair;
import abstractfactory.model.sofas.ModernSofa;
import abstractfactory.model.sofas.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {


    @Override
    public Chair createChair() {
        return new ModernChair("Modern Chair");
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa("Modern Sofa");
    }
}
