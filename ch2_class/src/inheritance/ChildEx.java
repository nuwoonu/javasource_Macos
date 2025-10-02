package inheritance;

public class ChildEx {
    public static void main(String[] args) {
        // Parent parent = new Parent(5); //부모 생성자가 있어야지만 사용가능하다.
        Child child = new Child();
        Child2 child2 = new Child2();

        // System.out.println(parent.age);
        System.out.println("child age : "+child.age);
        child.play();
        child.list();
        System.out.println("child2 " + child2.age);
        child2.list();

        // System.out.println("name "+child.name.length()); // nullPointerException을 만난다는건 Heap영역에 올라가지 않았다는 의미.
    }
}
