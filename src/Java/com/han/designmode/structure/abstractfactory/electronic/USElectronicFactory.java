package Java.com.han.designmode.structure.abstractfactory.electronic;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGeLiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGuoMeiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IHaiErFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IMeiDiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.GeLiFactoryImpl;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.GuoMeiFactoryImpl;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.HaierFactoryImp;
import Java.com.han.designmode.structure.abstractfactory.electronic.product.MeiDiFactoryImpl;

public class USElectronicFactory implements IElectronicFactory {
    @Override
    public IHaiErFactory getHaiErFactory() {
        System.out.println("海尔美国工厂");
        return new HaierFactoryImp();
    }

    @Override
    public IMeiDiFactory getMeiDiFactory() {
        System.out.println("美的美国工厂");
        return new MeiDiFactoryImpl();
    }

    @Override
    public IGeLiFactory getGeLiFactory() {
        System.out.println("格力美国工厂");
        return new GeLiFactoryImpl();
    }

    @Override
    public IGuoMeiFactory getGuoMeiFactory() {
        System.out.println("国美美国工厂");
        return new GuoMeiFactoryImpl();
    }
}
