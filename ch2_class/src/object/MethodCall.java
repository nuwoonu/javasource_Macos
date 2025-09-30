package object;

 // 메모리 단 올라가는 시점의 차이 클래스 메서드 와 일반메서드 비교!

public class MethodCall {
    int iv =10;
    static int cv = 20; // 클래스 변수 저장 후 스태틱 메모리영역에 올라감.
    int iv2 = cv;

    static void staticMethod1()  //클래스 메서드 저장 끝나면 올라감
    {
        MethodCall obj = new MethodCall();
        // System.out.println(iv);
        System.out.println(obj.iv);
        System.out.println(cv);
    }
     void instanceMethod1()
    {
        //static 변수 호출
        System.out.println(cv);
        
        System.out.println(iv);
    }
    static void staticMethod2() //new 생성자를 안썼었기때문에 instanceMethod1를 사용 할 수 없음.
    {
        //클래스 메소드 호출
        staticMethod1();
        // instanceMethod1(); //가능하게 하려면.
        MethodCall obj = new MethodCall();
        obj.instanceMethod1();
        
    }
   
    void instanceMethod2() //올라가는 시점이 같기때문에 에러가 안뜸.
    {
        staticMethod1();
        instanceMethod1();
    }

}
