package Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IWashingMachine;

public class MeiDiWashingMachine implements IWashingMachine {
    @Override
    public String getBrandName() {
        return "美的洗衣机";
    }

    @Override
    public Double getPrice() {
        return 785.0;
    }
}
