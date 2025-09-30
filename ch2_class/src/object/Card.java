package object;

// 변수
// 1. 인스턴스(속성,멤버,필드) 변수 **[클래스 영역 내부의 선언된 변수들]** 인스턴스 변수는 인스턴스가 생성 후에 사용가능
// 2. 클래스 변수 : 클래스 영역 (static) => 클래스가 메모리에 올라갈 때 사용 가능. static == ***공유의 의미를 갖고있음***
//    일반 클래스 변수는 작성 후 저장하면..
// 3. 지역변수 : 메서드 영역, **생성자 매개변수,{블록 안에 선언된 변수}** ==> 변수가 실행될 때

public class Card 
{
    // private String kind;
    // static String cv; //클래스 변수 static 변수는 값이 고정되어있는것을 여러번 사용할때. 유용하게쓰임.


    // void print(int i)
    // {
    //     int j=0;
    // }

    String kind;
    int number;
    static int width = 100; //static의 저장영역은 heap영역과 다름
    static int height = 150; //그래서 사용할때 Class이름으로 접근 ==> Class명.

    
}
