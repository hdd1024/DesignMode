package Java.com.han.designmode.structure.decorate;

public class Pancake extends APancake {
    protected int price = 8;
    protected String pancakeDec="普通煎饼";
    @Override
    protected String getDec() {
        System.out.println(pancakeDec);
        return pancakeDec;
    }

    @Override
    public int expenditure() {
        return price;
    }
}
