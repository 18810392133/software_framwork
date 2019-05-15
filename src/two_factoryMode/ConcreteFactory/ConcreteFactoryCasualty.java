package two_factoryMode.ConcreteFactory;

import two_factoryMode.ConcreteInsurance.ConcreteInsuranceCasualty;
import two_factoryMode.Interface.AbstractFactory;
import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteFactoryCasualty implements AbstractFactory {
    @Override
    public AbstractInsurance createInsurance() {
        return new ConcreteInsuranceCasualty();
    }
}
