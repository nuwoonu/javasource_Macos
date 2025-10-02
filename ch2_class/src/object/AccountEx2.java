package object;

public class AccountEx2 {
    public static void main(String[] args) {
        Account[] accounts = new Account[3]; // 안에 담아지는 요소는 null로 초기화됨.
        
        accounts[0]= new Account("111", "홍길동",10000);
        accounts[1]= new Account("222", "성춘향",20000);
        accounts[2]= new Account("333", "이순신",30000);

        print(accounts); //사용자 정의? 

        //성춘향 계좌에 입금

        accounts[1].deposit(100000);
        System.out.println(accounts[1].getOwner()+ ":" + accounts[1].getOwner()+":"+accounts[1].getBalance());

    }

    static void print(Account[] accounts) //인자값은 배열 그대로 넘겨주는것
        {
            for (Account account : accounts)
            {
                System.out.println("======================================");
                System.out.println("1. 계좌 번호 : "+account.getAccountNo());
                System.out.println("2. 계좌주 : "+account.getOwner());
                System.out.println("3. 잔액 : "+account.getBalance());
            }
        }
    
}
