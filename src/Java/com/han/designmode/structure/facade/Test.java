package Java.com.han.designmode.structure.facade;

public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("女朋友一枚");
        GiftExchangeService exchangeService = new GiftExchangeService();
        exchangeService.giftExchange(pointsGift);
    }
}
