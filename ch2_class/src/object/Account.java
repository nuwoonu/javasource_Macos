package object;

public class Account {
    //은행계좌
    //계좌번호(120-12-111) , 계좌주(홍길동), 잔액(100000)

    //private 은 해당 클래스에서만 접근가능. == class 파일내에서만
    private String AccountNo,owner;
    private long balance;
    
    public Account(String accountNo, String owner, long balance) {
        AccountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
    }
    
    public long getBalance() { // 은닉화된 멤버 변수의 값을 조회할때 getter 메소드 사용
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    public String getAccountNo() {
        return AccountNo;
    }
    void deposit(long amount)
    {
        balance += amount;
    }
    public long withdraw(long amount) {
        balance -= amount;
        return balance;
    }
    // 입금한다(잔액 = 잔액 + 입금액) ==> 입금액 인자로 받아서 처리 ==> 리턴타입 없음 ,deposit
    // 출금한다.(잔액 = 잔액 - 출금액) ==> 출금액 인자로 받아서 처리 ==> 잔액리턴 ,withdraw
    
    



}
