package two_factoryMode.ConcreteFactory;

import two_factoryMode.ConcreteInsurance.ConcreteInsuranceCarDamage;
import two_factoryMode.Interface.AbstractFactory;
import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteFactoryCarDamage implements AbstractFactory{
    @Override
    public AbstractInsurance createInsurance() {
        return new ConcreteInsuranceCarDamage();
    }
}
