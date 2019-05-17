package Java.com.han.designmode.structure.abstractfactory.electronic;

import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGeLiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IGuoMeiFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IHaiErFactory;
import Java.com.han.designmode.structure.abstractfactory.electronic.iproduct.ifactory.IMeiDiFactory;

public interface IElectronicFactory {

    IHaiErFactory getHaiErFactory();

    IMeiDiFactory getMeiDiFactory();

    IGeLiFactory getGeLiFactory();

    IGuoMeiFactory getGuoMeiFactory();
}
