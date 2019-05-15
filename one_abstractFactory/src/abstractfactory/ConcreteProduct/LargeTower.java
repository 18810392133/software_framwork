package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Tower;

public class LargeTower implements Tower {

    String name = "big tower";

    @Override
    public void create() {
        System.out.println("this is "+name);
    }
}
