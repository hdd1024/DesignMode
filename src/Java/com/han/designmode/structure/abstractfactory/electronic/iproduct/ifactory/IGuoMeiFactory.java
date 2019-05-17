package Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory;

import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiAirConditioner;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiRefrigerator;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei.GuoMeiWashingMachine;

public interface IGuoMeiFactory {
    //冰箱
    GuoMeiRefrigerator getRefrigerator();

    //洗衣机
    GuoMeiWashingMachine getWashingMachine();

    //空调
    GuoMeiAirConditioner getAirConditioner();
}
