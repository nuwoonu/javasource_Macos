package object;

import java.util.Scanner;
//  *** 계좌 생성 및 계좌 조회 & 에금 & 출금
public class AccountEx3 { 
    static Scanner sc = new Scanner(System.in); // 스태틱을 이용해서 공유 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 선언
        Account[] accounts= new Account[100]; // 배열 선언

        // System.out.print("생성할 계좌의 수를 입력해주세요 : ");
        // int num = Integer.parseInt(sc.nextLine());

        // accounts = new Account[num]; //생성자 new를 통해서 Account 배열 요소갯수 지정.



        
        //배열 생성 new int[3],new Account[3]..

        

        // accounts[0]= new Account("111", "홍길동",10000);
        // accounts[1]= new Account("222", "성춘향",20000);
        // accounts[2]= new Account("333", "이순신",30000);
       


        //성춘향 계좌에 입금

        // accounts[1].deposit(100000);
        // System.out.println(accounts[1].getOwner()+ ":" + accounts[1].getOwner()+":"+accounts[1].getBalance());
        boolean run = true;
        while(run)
        {
            System.out.println("----------------------------");
            System.out.print("1. 계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 \n");
            System.out.print("선택 >> ");
            int no = Integer.parseInt(sc.nextLine()); //정수형 번호 키보드로부터 입력 받기

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;
                case 2:
                    accountList(accounts);
                    break;
                case 3:    
                    deposit(accounts);
                    break;
                case 4:    
                    withdraw(accounts);
                    break;
                case 5:    
                    run =false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
            
                default:
                    System.out.println("메뉴 번호 확인하세요.");
                    break;
            }
        }
    }

    static void createAccount(Account[] accounts)
    {
        
        //계좌 생성
        System.out.print("계좌번호를 입력해주세요 : ");
        String accountNo = sc.nextLine(); //계좌 번호입력.
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine(); //계좌 번호입력.
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());
        
        for (int j = 0; j < accounts.length; j++) 
        {
            if(accounts[j]== null)
            {
                accounts[j] = new Account(accountNo, owner, balance);
                break;
            }
            
        }
        
    }
    
    static void withdraw(Account[] accounts)
    {
        //출금 담당  
        Account account = findAccount(accounts);
        if (account == null) 
        {
            System.out.println("계좌번호 확인");
        }
        else
        {
            //입금액을 입력받아서 계좌 잔액에 추가.
            System.out.print("출금액을 입력하세요 : ");
            int amount = Integer.parseInt(sc.nextLine()); // *** 정수로 입력받아서 넘긴다. ***
            long balance = account.withdraw(amount);
            System.out.println("현재 잔액 : "+ balance);
        }
    }
        
    
    static void deposit(Account[] accounts)
    {
        //입금 담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        }
        else
        {
            //입금액을 입력받아서 계좌 잔액에 추가.
            System.out.print("입금액을 입력하세요 : ");
            int amount = Integer.parseInt(sc.nextLine()); // *** 정수로 입력받아서 넘긴다. ***
            account.deposit(amount);
        }
    }
    
    static Account findAccount(Account[] accounts)
    {
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        //앞에서부터 채우기 때문에 null이 아닐때 계속 반복문 진행 없으면 null을 리턴.
        for (Account account : accounts) {
           if(account != null) //account 가 널이 아니면
            {
                if(account.getAccountNo().equals(accountNo)) //조건을 ==으로 안하고 안전하게 equals로 사용
                {
                    return account;
                }
            }
        }
        return null;
    }

    // 아래 꺼 static void print(Account[] accounts)를 바꾼거
    static void accountList(Account[] accounts) //인자값은 배열 그대로 넘겨주는것
        {
            for (Account account : accounts)
            {
                if(account != null)
                {
                    System.out.println("======================================");
                    System.out.println("1. 계좌 번호 : "+account.getAccountNo());
                    System.out.println("2. 계좌주 : "+account.getOwner());
                    System.out.println("3. 잔액 : "+account.getBalance());
                }
               

                // System.out.println(account); //변수자체는 찍힘.
                
            }
        }
    
}
