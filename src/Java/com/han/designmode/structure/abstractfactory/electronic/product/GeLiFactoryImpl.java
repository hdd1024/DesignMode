package Java.com.han.designmode.structure.abstractfactory.electronic.product;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGeLiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiWashingMachine;

public class GeLiFactoryImpl implements IGeLiFactory {
    @Override
    public GeLiRefrigerator getRefrigerator() {
        System.out.println("**格力**工厂生产的==冰箱==");

        return new GeLiRefrigerator();
    }

    @Override
    public GeLiWashingMachine getWashingMachine() {
        System.out.println("**格力**工厂生产的==洗衣机==");

        return new GeLiWashingMachine();
    }

    @Override
    public GeLiAirConditioner getAirConditioner() {
        System.out.println("**格力**工厂生产的==空调==");
        return new GeLiAirConditioner();
    }
}
