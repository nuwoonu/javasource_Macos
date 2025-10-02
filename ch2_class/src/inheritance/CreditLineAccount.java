package inheritance;

public class CreditLineAccount extends Account{
    // 마이너스 한도
    private int creditLine;
    
    public CreditLineAccount(String accountNo, String owner, long balance,int creditLine) {
        super(accountNo, owner, balance);
        this.creditLine = creditLine;
    }
    
    // 출금 : 잔액(잔액 + 마이너스한도) - 사용액
    @Override
    public long withdraw(long amount) throws Exception {
        
        if(super.getBalance() + creditLine < amount ) //super 부모껏임을 명시 필수는 아님
        {
            throw new Exception("마이너스 한도 확인"); //익셉션 걸리면 밑에는 실행안함.
        }
        
        //잔액 (잔액 + 마이너스 한도) - 사용액
        // balance = (balance + creditLine) - amount;
        setBalance(getBalance() - amount);

        return super.getBalance(); //부모의 겟 발란스에 반환.
    }
}
