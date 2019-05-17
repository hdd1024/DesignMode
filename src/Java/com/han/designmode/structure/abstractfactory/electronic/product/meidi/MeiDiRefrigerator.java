package Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IRefrigerator;

public class MeiDiRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "美的冰箱";
    }

    @Override
    public Double getPrice() {
        return 1299.0;
    }
}
