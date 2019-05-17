package Java.com.han.designmode.structure.abstractfactory.electronic.product.haier;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IRefrigerator;

public class HaiErRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "海尔冰箱";
    }

    @Override
    public Double getPrice() {
        return 3799.0;
    }
}
