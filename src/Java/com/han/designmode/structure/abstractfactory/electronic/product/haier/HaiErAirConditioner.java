package Java.com.han.designmode.structure.abstractfactory.electronic.product.haier;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IAirConditioner;

public class HaiErAirConditioner implements IAirConditioner {
    @Override
    public String getBrandName() {
        return "海尔空调";
    }

    @Override
    public Double getPrice() {
        return 6999.0;
    }
}
