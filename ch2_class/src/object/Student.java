package object;

public class Student {
    // 멤버변수, 멤버메소드, 생성자 --> 필수는 아니지만 이러한 구조의 형태
    
    //멤버 변수
    // 이름 , 전화번호(010-1234-5678) , 주소(서울시 종로구 25)
    String name; //멤버변수 선언!
    String tel;
    String address;

    //생성자(constructor)
    public Student() {
    }

    //-----  메소드 -----
    public String getName() { // getter Method 메소드
        return name; //반환하면 멤버변수(전역)쪽으로 값을 보내준다. 
    }
    public String getAddress() {
        return address;
    }
    public String getTel() {
        return tel;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    // ******************************************
    // 이름 변경 메소드(함수) 작성  
    // 리턴 타입 메소드명(매개변수1, 매개변수2, 매개변수_n) {}
    // void int long float double boolean 참조타입 - String, []
    // public void changeName(){
    //     this.name = "테스트";
    // }
    // ******************************************
    
    
    // public void changeName(String name){
    //     this.name = name;
    // }

    public String changeName(String name){
        this.name = name;
        return this.name; // 멤버변수를 써도 됩니다.
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }
    
}
