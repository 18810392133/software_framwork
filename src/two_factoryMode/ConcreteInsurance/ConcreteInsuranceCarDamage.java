package two_factoryMode.ConcreteInsurance;

import two_factoryMode.Interface.AbstractInsurance;

public class ConcreteInsuranceCarDamage implements AbstractInsurance {
    String productName = "汽车损坏保险理赔";

    @Override
    public void stratInsurance() {
        System.out.println(productName);
    }
}
