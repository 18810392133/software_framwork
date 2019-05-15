package two_factoryMode.ConcreteInsurance;

import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteInsuranceDriverInjury implements AbstractInsurance {
    String productName = "驾驶员身体受伤保险";
    @Override
    public void stratInsurance() {
        System.out.println(productName);
    }
}
