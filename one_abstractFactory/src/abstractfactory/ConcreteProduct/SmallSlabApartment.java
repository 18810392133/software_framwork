package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.SlabApartment;

public class SmallSlabApartment implements SlabApartment {
    String productName = "this is SmallSlabApartment";
    @Override
    public void create() {
        System.out.println(productName);
    }
}
