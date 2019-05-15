package abstractfactory.Interface;
//抽象工厂创建一个产品的大类
public abstract interface AbstractFactory {
     abstract Product createSmall();
     abstract Product createMed();
     abstract Product createLarge();
}
