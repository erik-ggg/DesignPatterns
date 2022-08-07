package abstractfactory;

import abstractfactory.model.chairs.Chair;
import abstractfactory.model.chairs.VictoryChair;
import abstractfactory.model.sofas.Sofa;
import abstractfactory.model.sofas.VictorySofa;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictoryChair("Victorian chair");
    }

    @Override
    public Sofa createSofa() {
        return new VictorySofa("Victorian sofa");
    }
}
