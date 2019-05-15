package two_factoryMode.ConcreteInsurance;

import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteInsuranceMultipleAccidence implements AbstractInsurance {
    String productName = "多种事故保险";
    @Override
    public void stratInsurance() {
        System.out.println(productName);
    }
}
