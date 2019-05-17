package Java.com.han.designmode.structure.abstractfactory.electronic.product.geli;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IRefrigerator;

public class GeLiRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "格力冰箱";
    }

    @Override
    public Double getPrice() {
        return 399.0;
    }
}
