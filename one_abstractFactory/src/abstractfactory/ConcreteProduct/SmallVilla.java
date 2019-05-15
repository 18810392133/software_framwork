package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Villa;

public class SmallVilla implements Villa {
    String productName = "this is small villa";

    @Override
    public void create() {
        System.out.println(productName);
    }
}
