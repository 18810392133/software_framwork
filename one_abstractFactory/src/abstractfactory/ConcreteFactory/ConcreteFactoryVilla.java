package abstractfactory.ConcreteFactory;

import abstractfactory.Interface.AbstractFactory;
import abstractfactory.Interface.Villa;
import abstractfactory.ConcreteProduct.LargeVilla;
import abstractfactory.ConcreteProduct.MedVilla;
import abstractfactory.ConcreteProduct.SmallVilla;

public class ConcreteFactoryVilla implements AbstractFactory {
    @Override
    public Villa createSmall() {
        return new SmallVilla();
    }

    @Override
    public Villa createMed() {
        return new MedVilla();
    }

    @Override
    public Villa createLarge() {
        return new LargeVilla();
    }
}
