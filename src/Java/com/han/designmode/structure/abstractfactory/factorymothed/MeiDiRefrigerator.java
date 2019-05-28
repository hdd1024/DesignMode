package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 美的冰箱
 */
public class MeiDiRefrigerator implements IRefrigerator {
    @Override
    public String getBrandName() {
        return "美的冰箱";
    }

    @Override
    public double getPrice() {
        return 2999;
    }
}
