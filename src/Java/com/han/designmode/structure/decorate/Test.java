package Java.com.han.designmode.structure.decorate;

public class Test {


    public static void main(String[] args) {
        APancake pancake = new Pancake();
        pancake = new PancakeEgg(pancake);
        pancake = new PancakeSausage(pancake);

        int pancakePrice = pancake.expenditure();
        String pancakeDec = pancake.getDec();

        System.out.println("煎饼最终是：" + pancakeDec + "价格为：" + pancakePrice);

    }
}
