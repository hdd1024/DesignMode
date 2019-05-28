package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 美的冰箱工厂
 */
public class MeiDiRefrigeratorFactory implements IRefrigeratorFactory {
    @Override
    public IRefrigerator getIRefrigerator() {
        return new MeiDiRefrigerator();
    }
}
