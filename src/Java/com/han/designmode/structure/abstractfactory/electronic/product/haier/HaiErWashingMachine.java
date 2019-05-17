package Java.com.han.designmode.structure.abstractfactory.electronic.product.haier;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IWashingMachine;

public class HaiErWashingMachine implements IWashingMachine {
    @Override
    public String getBrandName() {
        return "海尔洗衣机";
    }

    @Override
    public Double getPrice() {
        return 2499.0;
    }
}
