package shop;

public class ShopEx {
    public static void main(String[] args) {
       
        TV tv = new TV("삼성TV", 2300000, "4K");
        CellPhone cellPhone = new CellPhone("Galaxy Z Fold", 12000000, "U+");
        //속성 초기화 1. 생성자 2. setter method
        // tv.name = "";

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("삼성TV", 2300000, "4K");
        // tvs[1] = new TV("엘지TV", 2300000, "4K");
        // tvs[2] = new TV("삼성TV", 2300000, "4K");

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone("Galaxy Z Fold", 12000000, "U+");
        // cellPhones[1] = new CellPhone("Galaxy Z Fold", 12000000, "U+");
        // cellPhones[2] = new CellPhone("Galaxy Z Fold", 12000000, "U+");

        
        // Product[] products = new Product[5]; // Product 객체, 자식 객체 다 담을 수 있다!.
        // products[0] = new TV("삼성 TV", 2300000, "4K");
        // products[1] = new TV("LG TV", 3000000, "4K");
        // products[2] = new CellPhone("Galaxy Z Fold", 12000000, "U+");
        // products[3] = new CellPhone("iPhone", 13000000, "SKT");
        // products[4] = new CellPhone("Galaxy Z Flip", 10000000, "KT");

        // for (Product product : products) {
        //     product.prinDetail();
        // }

        // User user = new User("홍길동", PayType.CARD);
        MyShop myShop = new MyShop();
        
        
        // 이름 지정(가게명)
        myShop.setTitle("Myshop");
        
        // 유저 등록
        myShop.genUser();
        // 상품 등록
        myShop.genProduct();
        myShop.start();
        
    }
}