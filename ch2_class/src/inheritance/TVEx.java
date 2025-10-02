package inheritance;

public class TVEx {
    public static void main(String[] args) {
        //상속 관계에 있을때 인스턴스 생성 방법
        CaptionTV cTv= new CaptionTV(48, 7, false, "black");

        // TV tv = new CaptionTV(0, 0, false, null); //

        // 자식 클래스에서 사용 가능한 것 : (1. 부모의멤버 변수, 2. 부모의 메소드, 3. 자식 클래스의 멤버변수 및 메소드)
        cTv.channel = 8;
        cTv.setPower(true);
        cTv.displayCaption("자막 사용 가능");

    }
}
