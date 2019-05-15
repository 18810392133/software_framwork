package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Villa;

public class MedVilla implements Villa {
    String productName = "this is medium villa";

    @Override
    public void create() {
        System.out.println(productName);
    }
}
