package object;

public class Calc {
    
    int plus(int x,int y)
    {
        return x+y;                            //다시 avg reulst로 리턴
    }
    double avg(int x, int y)
    {
        int result = plus(x, y);               //plus 메소드(함수)로 이동

        return result/2 ;
    }
    void execute()
    {
        double result =avg(15,8);
        println("실행결과 : "+result);
    }
    void println(String message)
    {
        System.out.println(message);
    }
}
