package inheritance;

public class Buyer {
    
    int money = 1000;
    int bonusPoint =0;


        void buy(Product p){
        {
            if(money <p.price)
            {
                System.out.println("잔액부족");
                return;
            }
            money = money - p.price;
            bonusPoint += p.bonusPoint;
            System.out.println(p+"를 구매하셨습니다."); //p ==> 오버라이딩 투 스트링
        }
    }
}
