package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Tower;

public class SmallTower implements Tower {
    String productName = "this is small tower";
    @Override
    public void create() {
        System.out.println(productName);
    }
}
