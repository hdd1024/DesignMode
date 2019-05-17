package Java.com.han.designmode.structure.abstractfactory.electronic.product.guomei;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IAirConditioner;

public class GuoMeiAirConditioner implements IAirConditioner {
    @Override
    public String getBrandName() {
        return "国美空调";
    }

    @Override
    public Double getPrice() {
        return 2799.0;
    }
}
