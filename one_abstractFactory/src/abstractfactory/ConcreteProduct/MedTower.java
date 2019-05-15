package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Tower;

public class MedTower implements Tower {
    String productName = "this is medium tower";
    @Override
    public void create() {
        System.out.println(productName);
    }
}
