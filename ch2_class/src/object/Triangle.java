package object;

public class Triangle {
    // 속성 밑변,높이
    // 기능 : 삼각형 너비

    double basaeLine , height;

    double getArea()
    {
        return basaeLine * height / 2 ;
    }

    public Triangle() {
    }

    public Triangle(double basaeLine, double height) {
        this.basaeLine = basaeLine;
        this.height = height;
    }

    public void setBasaeLine(double basaeLine) {
        this.basaeLine = basaeLine;
    }public void setHeight(double height) {
        this.height = height;
    }
    

    
}
