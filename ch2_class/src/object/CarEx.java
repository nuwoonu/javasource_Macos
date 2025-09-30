package object;

public class CarEx {
    public static void main(String[] args) {
        
        int x = 10 ;

        
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

        // println(car);
        println(car2);
    }
    //대문자 타입으로 시작하면 주소값을 가짐. 주소값이 있으면 원본 변경가능!
    public static void println(Car car) //(type == 클래스 매개변수 == car 인스턴스)
    {
        car.setColor("빨강");
        System.out.println("-----------------");
        System.out.println("제조회사 : " + car.getCompanyName());
        System.out.println("모델명 : " + car.getModel());
        System.out.println("색상 : " + car.getColor());
        System.out.println("최고속도 : " + car.getMaxSpeed());
        System.out.println("-----------------");
    }
    public static void test(String str)
    {

    }
}
