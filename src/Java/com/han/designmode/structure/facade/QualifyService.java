package Java.com.han.designmode.structure.facade;

/**
 * 积分礼物校验体系
 */
public class QualifyService {

    /**
     * 检验是否有效
     *
     * @param pointsGift 积分礼物
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift) {
        if (pointsGift != null) {
            System.out.println("校验：" + pointsGift.getName() + "是有效的");
            return true;
        }
        return false;
    }
}
