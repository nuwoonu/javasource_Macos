package inheritance;

public /* final */ class Person {
    //final keyword 마지막의,변경될 수 없는

    // final int MAX = 15; // 상수의 개념엔 대문자.

    //어차피 공통으로 사용할 상수를 선언할꺼라면
    static final int MAX = 15;
    
    String name;

    
    public Person(String name) {
        this.name = name;
    }


    final void test()
    {

    }

}
