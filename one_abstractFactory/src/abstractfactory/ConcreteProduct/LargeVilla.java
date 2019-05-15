package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.Villa;

public class LargeVilla implements Villa {

    String productName = "this is large villa";


    @Override
    public void create() {
        System.out.println(productName);

    }
}
