package abstractfactory;

import abstractfactory.model.chairs.Chair;
import abstractfactory.model.sofas.Sofa;

public interface FurnitureFactory {

    Chair createChair();

    Sofa createSofa();
}
