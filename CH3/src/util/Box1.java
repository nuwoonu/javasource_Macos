package util;

public class Box1 {
    // Generics : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스 컴파일 시의 타입 체크

    Object item;

    public void setItem(Object item)
    {
        this.item = item;
    }
    public Object getItem() {
        return item;
    }
}
