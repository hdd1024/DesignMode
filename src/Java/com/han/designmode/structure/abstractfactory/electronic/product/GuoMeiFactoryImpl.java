package Java.com.han.designmode.structure.abstractfactory.electronic.product;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGuoMeiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiWashingMachine;

public class GuoMeiFactoryImpl implements IGuoMeiFactory {
    @Override
    public GuoMeiRefrigerator getRefrigerator() {
        System.out.println("**国美**工厂生产的==冰箱==");

        return null;
    }

    @Override
    public GuoMeiWashingMachine getWashingMachine() {
        System.out.println("**国美**工厂生产的==洗衣机==");

        return null;
    }

    @Override
    public GuoMeiAirConditioner getAirConditioner() {
        System.out.println("**国美**工厂生产的==空调==");

        return null;
    }
}
