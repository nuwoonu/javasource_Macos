package inheritance;

public class BonusPointAccount extends Account {// 상속관계
    private int bonusPoint;
    public BonusPointAccount(String accountNo, String owner, long balance,int bonusPoint) {
        super(accountNo, owner, balance);
        this.bonusPoint = bonusPoint;
    }
    // 예금을 할때 마다 보너스 포인트가 들어가는 예제.
    // 예금 + 보너스포인트 적립
    // 오버라이딩 개념
    @Override
    void deposit(long amount) {
        //예금한다 부모꺼 그대로 호출
        super.deposit(amount);
        // 보너스포인트 적립 :  예금액의 1% 
        int point = (int)(amount * 0.01) ;
        bonusPoint += point;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
    
}
