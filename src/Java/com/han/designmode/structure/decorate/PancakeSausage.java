package Java.com.han.designmode.structure.decorate;

public class PancakeSausage extends APancakeStructure {
    public PancakeSausage(APancake aPancake) {
        super(aPancake);
    }

    @Override
    protected String getDec() {
        System.out.println("加香肠");
        return super.getDec() + "加香肠";
    }

    @Override
    public int expenditure() {
        return super.expenditure() + 1;
    }
}
