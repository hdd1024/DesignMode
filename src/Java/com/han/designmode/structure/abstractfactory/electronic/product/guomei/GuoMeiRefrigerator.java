package Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IRefrigerator;

public class GuoMeiRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "国美冰箱";
    }

    @Override
    public Double getPrice() {
        return 3799.0;
    }
}
