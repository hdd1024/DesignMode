package Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory;

import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.geli.GeLiWashingMachine;

public interface IGeLiFactory {
    //冰箱
    GeLiRefrigerator getRefrigerator();

    //洗衣机
    GeLiWashingMachine getWashingMachine();

    //空调
    GeLiAirConditioner getAirConditioner();

}
