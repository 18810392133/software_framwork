package two_factoryMode;

import two_factoryMode.ConcreteFactory.ConcreteFactoryCarDamage;
import two_factoryMode.ConcreteFactory.ConcreteFactoryCasualty;
import two_factoryMode.ConcreteFactory.ConcreteFactoryDriverInjury;
import two_factoryMode.ConcreteFactory.ConcreteFactoryMultipleAccident;
import two_factoryMode.Interface.AbstractFactory;
import two_factoryMode.Interface.AbstractInsurance;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = null;
        AbstractInsurance insurance;
        Scanner i = new Scanner(System.in);
        System.out.println("请选择您要生成的汽车保险：");
        System.out.println("1. 驾驶员身体受伤保险  2.汽车损坏保险  3.人员伤亡保险  4.多种事故保险");
        int insuranceType = i.nextInt();

        switch (insuranceType) {
            case 1:
                factory = new ConcreteFactoryDriverInjury();
                break;
            case 2:
                factory = new ConcreteFactoryCarDamage();
                break;
            case 3:
                factory = new ConcreteFactoryCasualty();
                break;
            case 4:
                factory = new ConcreteFactoryMultipleAccident();

                break;
        }
        System.out.println("请收好您选择创建的：");
        insurance = factory.createInsurance();
        insurance.create();
    }
}
