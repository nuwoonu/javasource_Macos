package exam;

public class Child extends Parent{
    public void print()
    {
        super.setNum1(10);
        System.out.println(getNum1());

        System.out.println(super.name);
        System.out.println(super.grade);
    }
}
