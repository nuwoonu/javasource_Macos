package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo info = new SubscriberInfo(); //객체 변수 (객체 인스턴스) 생성

        //속성 변경(초기화)
        // 1. 직접 접근 : private 인 경우 사용하면 불가
        // info.name = "홍길동";
        // 2.생성자
        // 3.메소드 : set
        info.setId("abcdedfe77");
        info.setName("홍길동");
        info.changePassword("aeefdfe78$$");
        info.changePhone("010-1234-5678");

        //가입자 정보 조회
        //1. 간단조회 toString ==> 개발자 확인용으로 사용
        // System.out.println(info.toString());
        System.out.println(info); // toString() 자동으로 호출됨.
        //2. 개별조회 get메서드
        System.out.println("아이디 : " + info.getId());
        System.out.println("이름 : " + info.getName());
        System.out.println("비밀번호 : " + info.getPassword());
        System.out.println("전화번호 : " + info.getPhone());
        
    }
}
