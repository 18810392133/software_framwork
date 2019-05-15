package two_factoryMode.ConcreteFactory;

import two_factoryMode.ConcreteInsurance.ConcreteInsuranceDriverInjury;
import two_factoryMode.Interface.AbstractFactory;
import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteFactoryDriverInjury implements AbstractFactory {
    @Override
    public AbstractInsurance createInsurance() {
        return new ConcreteInsuranceDriverInjury();
    }
}
