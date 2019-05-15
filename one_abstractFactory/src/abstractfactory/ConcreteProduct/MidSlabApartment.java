package abstractfactory.ConcreteProduct;

import abstractfactory.Interface.SlabApartment;

public class MidSlabApartment implements SlabApartment {
    String productName = "this is mediumSlabAprtment";
    @Override
    public void create() {
        System.out.println(productName);
    }
}
