package Java.com.han.designmode.structure.facade;

/**
 * 运输系统
 */
public class ShippingServie {
    public String shipGif(PointsGift pointsGift) {
        System.out.println("礼物：" + pointsGift.getName() + "正在运输...");
        return "运输完成。";
    }
}
