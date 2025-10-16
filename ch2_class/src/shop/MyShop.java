package shop;

import java.util.Scanner;

public class MyShop implements IShop {
    private String title;
    Product[] products = new Product[5]; //제품등록
    Product[] carts = new Product[5]; // 장바구니
    User[] users = new User[2];
    
    private int selUser; // 전역변수

    
    
    public void setTitle(String title) {
        this.title = title;
    }
    
     @Override
    public void start() {
        System.out.println(title + " : 메인 화면 - 계정 선택");
        System.out.println("========================================");
        int i = 0;
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }
        // for (int j = 0; j < users.length; j++) {
        // System.out.printf("[%d]%s(%s)\n", j, users[j].getName(),
        // users[j].getPayType());
        // }
        System.out.println("[x]종 료");
        System.out.print("선택 : ");

        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();

        switch (sel) {
            case "x":
            case "X":
                System.out.println("** 프로그램 종료 **");
                System.exit(0);
                break;
            default:
                selUser = Integer.parseInt(sel);
                break;
        }

        System.out.printf("## %s 선택 ##\n", sel);
        // sc.close();
        // 상품 출력
        productList();
    }

    @Override
    public void productList() // 상품출력
    {
        int i=0;
        System.out.println(title+" : 상품 목록 - 상품 선택");
        System.out.println("==========================");
        for (Product product : products) {
            System.out.printf("[%d]",i);
            product.prinDetail();
            i++;
        }

        System.out.println("[h]메인 화면");
        System.out.println("[c]체크 아웃");

        System.out.printf("선택 :  \n");
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        System.out.printf("## %s 선택 ## \n",sel);
        switch (sel) 
        {
            case "h":
                start();
                break;
        
            case "c":
                checkOut();
                break;
            default:
                int no = Integer.parseInt(sel);
                // for (Product product : carts) 
                // {
                //     if(product == null)
                //     {
                //         carts[j]= products[no];
                //         j++;
                //         break;
                //     }   
                // }
                for (int j = 0; j < carts.length; j++) {
                    if(carts[j]==null)
                    {
                        carts[j] = products[no];
                        break;
                    }
                }
                productList();
                break;
        }
          
        // int menu = Integer.parseInt(sc.nextLine());
        // System.out.printf("## %d 선택##",menu);
    }
    @Override
    public void checkOut(){  // 결제처리

        int i=0;
        int sum=0;
        System.out.println(title+" : 체크아웃");
        System.out.println("==========================");
        for (Product product : carts) {
            if(product != null)
            {
                System.out.printf("[%d] %s(%d)\n",i++,product.getName(),product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("==========================");
        System.out.println("결제 방법: %s" + users[selUser].getPayType());
        System.out.printf("합계 : %d 원 입니다\n",sum);
        System.out.println("[p] 이전, [q] 결제 완료");
        System.out.printf("선택 : \n");

        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();
        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다 ###");
                System.exit(0);
                break;
            case "p":
                productList();
                break;
            default:
                checkOut();
                break;
        }

    }
    @Override
    public void genUser() // 사용자 등록
    {
        users[0]= new User("홍길동", PayType.CARD);
        users[1]= new User("성춘향", PayType.CASH);
    }
    @Override
    public void genProduct() // 상품 등록
    {
        products[0] = new TV("삼성 TV", 2300000, "4K");
        products[1] = new TV("LG TV", 3000000, "4K");
        products[2] = new CellPhone("Galaxy Z Fold", 12000000, "U+");
        products[3] = new CellPhone("iPhone", 13000000, "SKT");
        products[4] = new CellPhone("Galaxy Z Flip", 10000000, "KT");
    }

}
