package inheritance;
// 다형성 개념(polymorphism)
// 여러가지 형태를 가질 수 있는 능력
// 부모 = new 자식() 허용
// ----------
// print(자식)
// void print(부모){};

// 코드간략화를 위한 것.
// 상속과 오버라이딩을 통한 같은 메소드로 다양한 출력 가능!
// 왼쪽은 부모로 작성 오른쪽은 자식

// 오버라이딩 == 자식꺼 실행
public class AnimalEx {
    public static void main(String[] args) {
        //인스턴스 생성
        Animal animal = new Animal();


        Carnivore carnivore = new Carnivore();
        carnivore.eat();
        carnivore.print();

        Herbivore herbivore = new Herbivore();
        // 자식 = 부모 대입불가.
        herbivore = (Herbivore) animal;
       
        herbivore.eat();

        // 부모 = 자식
        // Animal animal = new Carnivore(); //관계는 허용 상속관게가 있을때만.
        // animal.eat();
        // ((Carnivore)animal).print(); //왼쪽을 부모로 해서 새로운 메소드는 안됨.

        // animal = new Herbivore();
        // animal.eat();

        // Carnivore carnivore2 = new Carnivore();

        // **** 형제 자매 관계는 없어서 자식끼리 인스턴스 형성 불가. ****



    }
}
