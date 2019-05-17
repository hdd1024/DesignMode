package Java.com.han.designmode.structure.abstractfactory.electronic.product;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IHaiErFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErWashingMachine;

public class HaierFactoryImp implements IHaiErFactory {
    @Override
    public HaiErRefrigerator getRefrigerator() {
        System.out.println("**海尔**工厂生产的==冰箱==");
        return new HaiErRefrigerator();
    }

    @Override
    public HaiErWashingMachine getWashingMachine() {
        System.out.println("**海尔**工厂生产的==洗衣机==");
        return new HaiErWashingMachine();
    }

    @Override
    public HaiErAirConditioner getAirConditioner() {
        System.out.println("**海尔**工厂生产的==空调==");
        return new HaiErAirConditioner();
    }
}
