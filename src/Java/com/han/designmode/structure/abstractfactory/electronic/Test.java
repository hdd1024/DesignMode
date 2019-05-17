package Java.com.han.designmode.structure.abstractfactory.electronic;

import Java.com.han.designmode.structure.abstractfactory.electronic.product.HaierFactoryImp;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.haier.HaiErAirConditioner;

public class Test {

    public static void main(String[] args) {
        IElectronicFactory chinaElectronicFactory = new USElectronicFactory();
        HaiErAirConditioner airConditioner = chinaElectronicFactory.getHaiErFactory().getAirConditioner();
        System.out.println("品牌名：" + airConditioner.getBrandName() + "品牌价格：" + airConditioner.getPrice());

    }
}
