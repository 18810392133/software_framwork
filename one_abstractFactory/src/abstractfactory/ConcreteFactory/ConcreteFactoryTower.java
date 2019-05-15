package abstractfactory.ConcreteFactory;

import abstractfactory.Interface.AbstractFactory;
import abstractfactory.Interface.Tower;
import abstractfactory.ConcreteProduct.LargeTower;
import abstractfactory.ConcreteProduct.MedTower;
import abstractfactory.ConcreteProduct.SmallTower;

public class ConcreteFactoryTower implements AbstractFactory {
    @Override
    public Tower createSmall() {
        return new SmallTower();
    }

    @Override
    public Tower createMed() {
        return new MedTower();
    }

    @Override
    public Tower createLarge() {
        return new LargeTower();
    }
}
