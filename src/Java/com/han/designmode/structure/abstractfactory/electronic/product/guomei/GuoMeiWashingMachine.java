package Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IWashingMachine;

public class GuoMeiWashingMachine implements IWashingMachine {
    @Override
    public String getBrandName() {
        return "国美洗衣机";
    }

    @Override
    public Double getPrice() {
        return 1999.0;
    }
}
