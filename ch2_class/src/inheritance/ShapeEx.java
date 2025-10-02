package inheritance;

public class ShapeEx {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        // Point[] points = {new Point(10,10),new Point(20,20),new Point(30,30)}; 2가지방법.
        Point[] points = new Point[3];
        
        // 하나씩 개별로 주어질 때
        // points[0] = new Point();
        // points[0].x =10;
        // points[0].y =10;

        // points[1] = new Point();
        // points[1].x =20;
        // points[1].y =20;

        // points[2] = new Point();
        // points[2].x =30;
        // points[2].y =30;

        points[0] = new Point(10,10);
        points[1] = new Point(20,20);
        points[2] = new Point(30,30);

        Triangle triangle = new Triangle(points);
        triangle.draw(); //nullPointerException == null 인데 가지고오려고 할 때. (포함관계일 때 가장 많이 발생함)

    }
}
