package object;

public class MyMath {
    //메소드만 만든것! 생성자는 default 생성자 만들어짐
    long add(long a, long b)
    {
        return a+b;
    }
    long add(long a, long b,int c)
    {
        return a+b+c;
    }

    //메소드 오버로딩
    //이름이 같아야한다
    //매개변수의 객수, 타입이 달라야한다.
    int add(int a, int b)
    {
        return a+b;
    }
    
    long subtract(long a, long b)
    {
        return a-b;
    }
    
    long multiply(long a, long b)
    {
        return a*b;
    }
    
    double divide(double a, double b)
    {
        return a/b;
    }
    
}
