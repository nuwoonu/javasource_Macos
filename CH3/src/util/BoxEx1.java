package util;

public class BoxEx1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.setItem("홍길동"); // new String("홍길동")
        String name = (String) box1.getItem();
        System.out.println(name);
        System.out.println(box1.getItem());

        box1.setItem(33); // Integer.valueOf(33)
        Integer i = (Integer)box1.getItem();

        box1.setItem(33.14); // Double.valueOf(33.14)
        double d = (Double) box1.getItem();

        Box2<String> box2 = new Box2<>();
        box2.setItem(name);
        String data = box2.getItem();


        // Box2<T>
        //  T : Type variable - 타입 변수 , 타입 매개변수
        //  Box2 : 원시 타입
    }
}
