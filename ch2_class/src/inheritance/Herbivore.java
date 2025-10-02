package inheritance;

// 채식 동물
public class Herbivore extends Animal{
    public Herbivore()
    {
        //super();// super()가숨어져있는거.
        System.out.println("Herbivore 생성자");
    }
    @Override
    public void eat() {
        System.out.println("풀을 먹는다. ");
    }
}
