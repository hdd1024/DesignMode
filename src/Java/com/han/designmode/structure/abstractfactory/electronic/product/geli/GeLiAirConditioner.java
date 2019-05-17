package Java.com.han.designmode.structure.abstractfactory.electronic.product.geli;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IAirConditioner;

public class GeLiAirConditioner implements IAirConditioner {
    @Override
    public String getBrandName() {
        return "格力空调";
    }

    @Override
    public Double getPrice() {
        return 2999.0;
    }
}
