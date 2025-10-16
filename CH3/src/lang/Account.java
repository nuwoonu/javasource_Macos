package lang;

import java.util.Scanner;

public class Account {
    //은행계좌
    //계좌번호(120-12-111) , 계좌주(홍길동), 잔액(100000)

    //private 은 해당 클래스에서만 접근가능. == class 파일내에서만
    private String AccountNo,owner;
    private long balance;
    Scanner sc = new Scanner(System.in);
    

    public Account(String accountNo) {
        AccountNo = accountNo;
    }

    public Account(String accountNo, String owner) {
        AccountNo = accountNo;
        this.owner = owner;
    }

    public Account(String accountNo, String owner, long balance) {
        // this(accountNo,owner);
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
    void deposit(long amount) //입금한다
    {
        balance += amount;
    }
    public long withdraw(long amount) throws BalanceInsufficientException {

        // 잔액 안에서 출금허용
        if (amount > balance) {
            throw new BalanceInsufficientException("잔액 부족");
        }
        balance -= amount;
        return balance;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override 
    public String toString() {
        return "Account [AccountNo=" + AccountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }
    
}
