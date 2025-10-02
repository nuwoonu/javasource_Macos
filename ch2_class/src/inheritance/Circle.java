package inheritance;

public class Circle extends Shape{ //extands를 사용하지않고 클래스를 불러오면 포함관계로 클래스를 불러옴.
    // int x; //원점의 x좌표
    // int y; //원점의 y좌표
    // Point point = new Point(); 생성자로 바로 인스턴스
    Point point; //멤버변수로 바로 들어오면 포함관계.
    int r; //반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }
    @Override
    void draw() {
        System.out.printf("[x=%d, y=%d color = %s]",point.x,point.y,color); //포함관계로 불러오면 인스터스가 생성된 후에 가져올 수 있다.
    }
    
}
