package two_factoryMode.ConcreteFactory;

import two_factoryMode.ConcreteInsurance.ConcreteInsuranceMultipleAccidence;
import two_factoryMode.Interface.AbstractFactory;
import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteFactoryMultipleAccident implements AbstractFactory {
    @Override
    public AbstractInsurance createInsurance() {
        return new ConcreteInsuranceMultipleAccidence();
    }
}
