package Java.com.han.designmode.structure.decorate;

public abstract class APancakeStructure extends APancake {
    protected APancake mApancake;

    public APancakeStructure(APancake aPancake) {
        this.mApancake = aPancake;
    }

    @Override
    public int expenditure() {
        return mApancake.expenditure();
    }

    @Override
    protected String getDec() {
        return mApancake.getDec();
    }
}
