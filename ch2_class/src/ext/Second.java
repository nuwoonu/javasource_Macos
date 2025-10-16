package ext;

import exam.Parent;

public class Second extends Parent{
    Parent parent = new Parent();

    public void info()
    {

        // super.name = "성춘향"; //default 상속관계에서도 접근 불가능 super.
        super.grade = "B";   //protected 클래스 상속관계가 있으면 다른패키지여도 super로 접근 가능.
        parent.getNum1();
        super.getNum1();
    }
}
