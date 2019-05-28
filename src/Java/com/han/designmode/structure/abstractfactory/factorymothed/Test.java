package Java.com.han.designmode.structure.abstractfactory.factorymothed;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        IRefrigeratorFactory refrigeratorFactory = new HaiErRefrigeratorFactory();
        IRefrigeratorFactory refrigeratorFactory2 = new GeLiRefrigeratorFactory();
        IRefrigeratorFactory refrigeratorFactory3 = new MeiDiRefrigeratorFactory();
        IRefrigerator refrigerator = refrigeratorFactory.getIRefrigerator();

        System.out.println("您购买了：" + refrigerator.getBrandName() + "，您需要支付：" + refrigerator.getPrice());
    }
}
