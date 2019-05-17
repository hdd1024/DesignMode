package Java.com.han.designmode.structure.abstractfactory.electronic.product.geli;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.IWashingMachine;

public class GeLiWashingMachine  implements IWashingMachine {
    @Override
    public String getBrandName() {
        return "格力洗衣机";
    }

    @Override
    public Double getPrice() {
        return 599.0;
    }
}
