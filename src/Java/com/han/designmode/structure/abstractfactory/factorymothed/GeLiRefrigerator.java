package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 格力冰箱
 */
public class GeLiRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "格力冰箱";
    }

    @Override
    public double getPrice() {
        return 3999;
    }
}
