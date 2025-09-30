package object;

public class CardEx {
    public static void main(String[] args) {
        CardEx obj = new CardEx();
        // kind 인스턴스 변수 사용
        // Card card = new Card();

        //클래스 변수 : 클래스.클래스변수 (접근방식)
        // Card.cv ="";
        Card card1 = new Card(); //card1의 주소가 생성됨.
        card1.kind = "spade";
        card1.number = 2;
        // System.out.printf("card1 : %d, %s, %d, %d\n",card1.number,card1.kind,Card.width,Card.height);
        System.out.println("번호 : "+card1.number);
        System.out.println("종류 : "+card1.kind);

        obj.info(card1);
        
        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;
        // System.out.printf("card2 : %d, %s, %d, %d\n",card2.number,card2.kind,Card.width,Card.height);
        System.out.println("번호 : "+card2.number);
        System.out.println("종류 : "+card2.kind);
        //Static 변수 변경시 (약간 전역변수의 느낌)
        Card.width  = 80;
        Card.height = 60;
    }
    void info(Card card)
    {
        System.out.println("번호 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("번호 : " + card.width);
        System.out.println("종류 : " + card.height);

    }
}
