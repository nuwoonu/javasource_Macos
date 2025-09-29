package object;

public class TV {
    // 속성[사양],[크기](52),[채널](7),[파워](true/false),[색상 표시] (black)
    // 기능 [채널변경],[전원 여부],[볼륨조절],

    int size;
    int channel;
    boolean power;
    String color;
    public TV() //생성자 만듦.
    {
        
    }
    @Override
    public String toString() {
        return "TV [size=" + size + ", channel=" + channel + ", power=" + power + ", color=" + color + "]";
    }
    public void setSize(int size) { //멤버 메소드 -> 멤버변수 값을 변경하는 형태 --> 셋팅하는 메소드들은 setter 메소드라고 부름
        this.size = size;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public void setPower(boolean power) {
        this.power = power; //this의 의미가 전역변수처럼 멤버변수에 대입하는것.
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void channelUp()
    {
        ++this.channel; //정수 형 멤버 변수 증감 연산자를 이용하여 값 변경가능.
    }
    public void channelDown()
    {
        --this.channel;
    }
    public int getSize() {
        return size;
    }
    public int getChannel() {
        return channel;
    }
    public boolean isPower() { //불린 타입은 getter 메소드가 is로 만들어진다.
        return power;
    }
    public String getColor() {
        return color;
    }

    
}
