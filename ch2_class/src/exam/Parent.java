package exam;

public class Parent {
    // 멤버변수(속성)는 외부 접근 차단
    private int num1;
    String name; //default로 선언된 경우 다른패키지에서 접근 불가
    protected String grade;
    private int print()
    {
        return 0;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
