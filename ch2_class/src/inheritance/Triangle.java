package inheritance;

public class Triangle extends Shape{
    // Point point1 = new Point(); //포함관계로 클래스 불러오기
    // Point point2 = new Point(); 
    // Point point3 = new Point(); 이런형식을 아래에 배열로 가져온다면...

    Point[] points = new Point[3]; //참조 타입이라 요소 안에는 null로 초기화.

    public Triangle(Point[] points) {
        this.points = points;
    }
    
    @Override
    void draw() {
        System.out.printf("p1 [x=%d, y=%d], p2[x =%d , y=%d], p3[x=%d, y=%d], color = %s]",points[0].x,points[0].y,points[1].x,points[1].y,points[2].x,points[2].y,color); //포함관계로 불러오면 인스터스가 생성된 후에 가져올 수 있다.
    }
    
}
