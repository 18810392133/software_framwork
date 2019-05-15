package abstractfactory.ConcreteFactory;

import abstractfactory.Interface.AbstractFactory;
import abstractfactory.Interface.SlabApartment;
import abstractfactory.ConcreteProduct.LargeSlabLabApartment;
import abstractfactory.ConcreteProduct.MidSlabApartment;
import abstractfactory.ConcreteProduct.SmallSlabApartment;

public class ConcreteFactorySlabApartment implements AbstractFactory {

    @Override
    public SlabApartment createSmall() {
        return new SmallSlabApartment();
    }

    @Override
    public SlabApartment createMed() {
        return new MidSlabApartment();
    }

    @Override
    public SlabApartment createLarge() {
        return new LargeSlabLabApartment();
    }
}
