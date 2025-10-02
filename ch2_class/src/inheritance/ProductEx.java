package inheritance;

public class ProductEx {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        //  new SamsungTV == Product p = new Computer(); 과 같은 것
        buyer.buy(new SamsungTV(300));
        buyer.buy(new Computer(200));

        System.out.println("잔액 : " + buyer.money);
        System.out.println("보너스포인트 : " + buyer.bonusPoint);

    }
}
