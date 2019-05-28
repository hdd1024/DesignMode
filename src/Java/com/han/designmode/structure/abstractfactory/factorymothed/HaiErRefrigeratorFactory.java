package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 海尔冰箱工厂
 */
public class HaiErRefrigeratorFactory implements IRefrigeratorFactory {
    @Override
    public IRefrigerator getIRefrigerator() {
        return new HaiErRefrigerator();
    }
}
