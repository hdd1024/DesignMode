package Java.com.han.designmode.structure.decorate;

public class PancakeEgg extends APancakeStructure {
    public PancakeEgg(APancake aPancake) {
        super(aPancake);
    }


    @Override
    protected String getDec() {
        System.out.println("加鸡蛋");
        return super.getDec()+"加鸡蛋";
    }

    @Override
    public int expenditure() {
        return super.expenditure()+2;
    }
}
