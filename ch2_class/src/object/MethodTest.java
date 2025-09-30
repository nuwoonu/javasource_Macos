package object;

//      메서드 
//      메서드를 만드는 이유: 재사용성이 높기 때문. 
//      중복된 코드를 제거할 수 있다. (코드 간략화)

//  1. 인스턴스(멤버) 메서드 : 클래스 영역 => 인스턴스 생성 후
//  2. 클래스 메서드: 클래스 영역(Static) => 클래스가 메모리에 올라갈때(공유) 사용가능. static 이부터야한다.


public class MethodTest {
    // Java 리턴 한개만 가능.
    
    // 두 개의 인자(매개변수)를 받아서 덧셈 후 덧셈 결과를 리턴.
    
    int sum(int num1,int num2)
    {
        return num1+num2;
    }

    // 두 개의 인자(== 매개변수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2)
    {
        return num1-num2;
    }



    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    float divide(float num1, float num2)
    {
        return num1/num2;
    }


    // 두 개의 인자를 받아서 하나의 문자열로 리턴
    String concat(String str1,String str2) //(매개변수 또한 지역변수와 같은 블록안에서만 사용가능!)
    {
        return str1+str2;
    }
        // 한 개의 int 타입의 배열을 받아서 배열을 리턴.
    
    int[] call(int[] arr) // int형 배열 메소드 형식
    {
        return arr;
    }

    String print()
    {
        return "안녕하세요";
    }


    

}
