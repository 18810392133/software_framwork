package abstractfactory;

import abstractfactory.Interface.AbstractFactory;
import abstractfactory.Interface.Product;
import abstractfactory.ConcreteFactory.ConcreteFactorySlabApartment;
import abstractfactory.ConcreteFactory.ConcreteFactoryTower;
import abstractfactory.ConcreteFactory.ConcreteFactoryVilla;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        Product product;
//选择产品

        Scanner p = new Scanner(System.in);
        System.out.println("请选择产品类型：1.板楼   2.别墅   3.塔楼");
        int productType = p.nextInt();
        switch (productType) {
            case 1:
                factory = new ConcreteFactorySlabApartment();
                break;
            case 2:
                factory = new ConcreteFactoryVilla();
                break;
            case 3:
                factory = new ConcreteFactoryTower();
                break;
        }
//选择规模

        Scanner s = new Scanner(System.in);
        System.out.println("请选择产品规模：1.大  2.中   3.小");
        int sizeType = s.nextInt();
        switch (sizeType) {
            case 1:
                product = factory.createLarge();
                product.create();
                break;
            case 2:
                factory.createMed().create();
                break;
            case 3:
                factory.createSmall().create();
                break;
        }
    }
}
