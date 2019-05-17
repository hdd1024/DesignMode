package Java.com.han.designmode.structure.facade;

/**
 * 积分支付系统
 */
public class PointPaymentService {

    public boolean pay(PointsGift pointsGift) {
        //扣几分
        System.out.println("积分支付成功" + pointsGift.getName());
        return true;
    }
}
