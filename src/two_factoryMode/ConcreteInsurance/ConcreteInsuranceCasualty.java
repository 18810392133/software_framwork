package two_factoryMode.ConcreteInsurance;

import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteInsuranceCasualty implements AbstractInsurance {
    String productName = "人员伤亡保险理赔";
    @Override
    public void stratInsurance() {
        System.out.println(productName);
    }
}
