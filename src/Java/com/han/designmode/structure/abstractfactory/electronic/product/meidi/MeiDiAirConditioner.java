package Java.com.han.designmode.structure.abstractfactory.electronic.product.meidi;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IAirConditioner;

public class MeiDiAirConditioner implements IAirConditioner {

    @Override
    public String getBrandName() {
        return "美的空调";
    }

    @Override
    public Double getPrice() {
        return 4999.0;
    }
}
