package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 海尔冰箱
 */
public class HaiErRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "海尔冰箱";
    }

    @Override
    public double getPrice() {
        return 5999;
    }
}
