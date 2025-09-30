package object;

public class Car {
    // 속성 : 제조사명(현대,기아), 모델명(아반떼), 색상(red,blue,black) , 최대 속도(200) 속성은 멤버변수!
    String companyName;
    String model;
    String color;
    int maxSpeed;

    // 생성자 : 클래스명(){} 구조를 띄고 여러개 작성이 가능하다. 보통 괄호안을 바꾼다
    // 클래스 이름과 동일해야한다!.
    // *****    생성자는 리턴값이 없다! (void도 쓰지 않음)      *****
    // 생성자 만드는 이유 : 1.멤버변수 초기화 목적 
    
    //** 생성자 오버로딩 : 하나의 클래스에 여러개의 생성자 존재 **
    //** 메소드 오버로딩 : 하나의 클래스에 여러개의 메소드 존재 **
    Car() { // 괄호안에 아무것도 없는 경우 default 생성자 (기본생성자)를 의미함.
            // 컴파일러가 생성자를 자동으로 추가 : 단 클래스에 정의된 생성자가 하나도 없는 경우

    }
    
    // source action add constructor
    public Car(String companyName) {
        this.companyName = companyName;
    }

    

    public Car(String companyName, String model) {
        this.companyName = companyName;
        this.model = model;
    }
    // **********************************************

    // public Car(String companyName, int color) { // 생성자 오버로딩시 매개변수 type 이나 순서가 달라야함.
    //     this.companyName = companyName;
    //     this.model = model;
    // }
    
    // ********************************************** 
    

    public Car(String companyName, String model, String color) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
    }

    

    public Car(String companyName, String model, String color, int maxSpeed) {
        this.companyName = companyName;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    

    void forward()
        {
            System.out.println(this.model+"전진한다");
        }
    void backward()
        {
            System.out.println(this.model+"후진한다");
        }
    
    void turn() {
        System.out.println(this.model + "회전한다");
    }

    

    public String getCompanyName() { //2개씩 1쌍으로 겟터 셋터 만들어짐.
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [companyName=" + companyName + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
                + "]";
    }


}
