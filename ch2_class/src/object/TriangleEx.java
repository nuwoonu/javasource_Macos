package object;

public class TriangleEx {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle();
        
        
        
        //속성(멤버변수) 초기화
        // 직접 접근
        triangle.basaeLine = 12;
        triangle.height =6;
        System.out.println(triangle.getArea());


        //생성자 사용
        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이"+triangle1.getArea());
        

        //setter Method 이용
        Triangle triangle2 = new Triangle();
        triangle2.setBasaeLine(10);
        triangle2.setHeight(5);
        System.out.println("넓이"+triangle2.getArea());
    }
}
