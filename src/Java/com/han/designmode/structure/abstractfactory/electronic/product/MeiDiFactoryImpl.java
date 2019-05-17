package Java.com.han.designmode.structure.abstractfactory.electronic.product;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IMeiDiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiWashingMachine;

public class MeiDiFactoryImpl implements IMeiDiFactory {
    @Override
    public MeiDiRefrigerator getRefrigerator() {
        System.out.println("**美的**工厂生产的==冰箱==");
        return null;
    }

    @Override
    public MeiDiWashingMachine getWashingMachine() {
        System.out.println("**美的**工厂生产的==洗衣机==");
        return null;
    }

    @Override
    public MeiDiAirConditioner getAirConditioner() {
        System.out.println("**美的**工厂生产的==空调==");
        return null;
    }
}
