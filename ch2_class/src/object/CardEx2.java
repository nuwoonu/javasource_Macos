package object;

public class CardEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 0으로 초기화
        arr[0] = 17;
        int[] arr2={17,18,19};

        //참조형 배열

        //null : 참조형에 값을 지정하지 않으면 null로 초기화.
        String[] arr3 = new String[2];
        System.out.println("String 배열 초기화 "+arr3[0]);

        Card[] cards = new Card[3];

        System.out.println(cards[0]);

        cards[0] = new Card();
        cards[0].kind = "heart";
        cards[0].number = 8;
        
        cards[1] = new Card();
        cards[1].kind = "spade";
        cards[1].number = 7;
        
        cards[2] = new Card();
        cards[2].kind = "heart";
        cards[2].number = 2;

        for (Card card : cards) { // for each 0번 요소부터 차례대로 접근할 때 사용 
            System.out.println("번호 : " + card.number);
            System.out.println("종류 : " + card.kind);
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.println("번호 : " + cards[i].number);
            System.out.println("종류 : " + cards[i].kind);
        }
    }
}
