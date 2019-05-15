package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.SlabApartment;

public class LargeSlabLabApartment implements SlabApartment {
    String productName = "this is largeSlabAprtment";
    @Override
    public void create() {
        System.out.println(productName);
    }
}
