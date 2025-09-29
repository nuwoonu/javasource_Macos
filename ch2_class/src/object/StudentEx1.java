package object;

public class StudentEx1 {
    public static void main(String[] args) {
        
        //객체 생성 == 인스턴스 생성
        Student obj = new Student(); //생성자 new로 Student class를 obj 인스턴스(변수??) 생성!

        //멤버 변수 초기화 == 생성된 인스턴스의 초기화.
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 15";

        //멤버 함수 == 메서드 호출 
        // 1)메서드 호출시 결과값 반환 경우 : 변수에 담거나 혹은 print구문으로 확인!
        // 2)메서드 호출시 결과값 반환이 없는경우 : 호출만하기 (실행만되도록)
        // obj.getAddress();
        // System.out.println(obj.getAddress());

       
       
        Student student = new Student();
        // 멤버변수 값을 변경하는 용도로 set 메소드를 사용..
        // 멤버변수 값을 가져오는 용도로 get 메소드를 사용
        student.setName("성춘향");
        student.setTel("010-5678-8596");
        student.setAddress("경기도 수원시");
        // System.out.println(student);

        System.out.println(student.getName()); // setName 메서드의 값을 getter메소드로 호출.



        // obj.changeName();
        // System.out.println(obj);


        obj.changeName("성천사");
        System.out.println(obj);
    }
}
