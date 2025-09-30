package object;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("120-12-111", "홍길동", 100000);
        //입금한다.
        account.deposit(50000);

        //입금 후 잔액 조회 getter 메소드로 확인.
        System.out.println("입금 후 잔액 = "+account.getBalance());


        //출금 한다.
        long balance=account.withdraw(70000);
        System.out.println("잔액 "+balance +"원");

        // 잔액 조회
        Account account2 = new Account("121-11-2222", "성춘향", 1500000);
        System.out.println("성춘향 잔액 : "+ account2.getBalance());
        System.out.println("======================================");
        System.out.println("1. 계좌 번호 : "+account2.getAccountNo());
        System.out.println("2. 계좌주 : "+account2.getOwner());
        System.out.println("3. 잔액 : "+account2.getBalance());
        System.out.println("======================================");
        System.out.println(account2.getAccountNo()+" "+account2.getOwner()+" "+account2.getBalance());
    }
}
