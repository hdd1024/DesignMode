package Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory;

import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi.MeiDiWashingMachine;

public interface IMeiDiFactory {

    //冰箱
    MeiDiRefrigerator getRefrigerator();

    //洗衣机
    MeiDiWashingMachine getWashingMachine();

    //空调
    MeiDiAirConditioner getAirConditioner();
}
