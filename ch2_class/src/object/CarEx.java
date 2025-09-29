package object;

public class CarEx {
    public static void main(String[] args) {
        //car 인스턴스 생성 : 생성자 기본적으로 호출됨.
        Car car = new Car(); 

        // ----멤버변수 초기화---- 직접접근 방식 (잘 사용 안함)
        car.companyName = "현대";
        car.model = "아반떼";
        car.color = "white";
        car.maxSpeed = 200;
        System.out.println(car);
        // 2. setter 메소드 사용
        


        //3. 생성자 이용. 생성자 이용한 초기화.

        Car car2 = new Car("기아"); // 바로 아규먼트 입력후 초기화.
        System.out.println(car2);
        Car car3 = new Car("현대", "소나타");
        System.out.println("car3 "+car3);
        Car car4 = new Car("현대", "아이오닉5", "gray");
        System.out.println(car4);
        Car car5 = new Car("현대", "포터", "white", 150);
        System.out.println(car5);

        car3.setColor("green"); //setter를 통해서 기존의 값을 변경도 가능하다.
        System.out.println("색상 지정후 car3 "+car3);
    }
}
