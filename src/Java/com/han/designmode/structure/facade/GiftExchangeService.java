package Java.com.han.designmode.structure.facade;

/**
 * 礼物兑换系统
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingServie shippingServie = new ShippingServie();

    public void giftExchange(PointsGift pointsGift) {
        //资格校验
        if (qualifyService.isAvailable(pointsGift)) {
            //积分扣除
            if (pointPaymentService.pay(pointsGift)) {
                String ship = shippingServie.shipGif(pointsGift);
                System.out.println(ship);
            }
        }
    }

}
