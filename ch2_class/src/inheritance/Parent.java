package inheritance;
// 상속의 개념
// 상속 == 기존의 클래스 재사용하여 새로운 클래스를 작성
// JAVA == 단일 상속 , 
// 조상(부모,상위 super)클래스
// 자손(자식,하위,파생)클래스

// 상속 불가 항목
// 생성자와 초기화 블럭은 상속되지 않는다
public class Parent {
    int age;
    String name;

    public Parent() {
    }

    public Parent(int age) {
        this.age = age;
    }
    public void list()
    {
        System.out.println("부모 클래스");
    }

}
