package inheritance;

public class Child extends Parent{
    public Child() //기본 생성자 생성!
    {
        super(15); // 부모의 생성자를 호출해줘 의미. 생성자 호출시 사용하는것!
    }
    void play()
    { 

        System.out.println("Play!!!");
    }
    @Override //@ -- 어노테이션 재정의
    public void list() {
        // super.list(); //super == 부모  super.메소드 == 부모의 메소드를 호출 하는것.
        System.out.println("자식 클래스");
    }
}
