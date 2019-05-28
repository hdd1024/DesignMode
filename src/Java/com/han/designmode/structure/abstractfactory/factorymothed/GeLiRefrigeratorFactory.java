package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 格力冰箱工厂
 */
public class GeLiRefrigeratorFactory implements IRefrigeratorFactory {
    @Override
    public IRefrigerator getIRefrigerator() {
        return new GeLiRefrigerator();
    }
}
