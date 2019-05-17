package Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory;

import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErWashingMachine;

public interface IHaiErFactory {
    //冰箱
    HaiErRefrigerator getRefrigerator();

    //洗衣机
    HaiErWashingMachine getWashingMachine();

    //空调
    HaiErAirConditioner getAirConditioner();
}
