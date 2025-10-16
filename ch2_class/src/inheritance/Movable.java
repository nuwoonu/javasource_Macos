package inheritance;

public interface Movable {
    // 인터페이스는 추상메소드만 가질 수 있다.
    //메소드를 선언하면 자동으로 추상메소드로 인식. (default로 추상메소드로 인식)

    // 멤버변수에 final을 붙이면 상수 ==> 반드시 초기화 필요.
    // final이 없어도 상수로 인식
    // 인터페이스는 멤버변수에 상수만 선언가능!!
    // 인터페이스는 모든것을 완전 추상화
    int pos=0;
    

    
    void move(int x,int y);

    // 일반 메소드를 만들고 싶다면 ==> static , default를 이용하여 생성.
    static void print(){}
    default void print2(){}
}
