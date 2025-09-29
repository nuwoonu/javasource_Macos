package object;

public class TVEx {
    public static void main(String[] args) {
        TV tv = new TV(); //TV클래스의 인스턴스 생성
        
        //.(dot)연산자는 왼쪽에서 오른쪽으로 해석.
        
        System.out.println(tv); //object.TV@7ad041f3 -> source action to string() == 오버라이딩 반환 
        
        // tv.power = true;
        // tv.size = 48;
        // tv.channel = 3;
        // tv.color = "black";
        
        
        tv.setPower(true);
        tv.setSize(48);
        tv.setChannel(3);
        tv.setColor("black");
        
        System.out.println(tv);

        TV tv2 = new TV(); //tv2의 객체 인스턴스 생성

        tv2.setPower(true);  //TV클래스의 멤버메소드 사용하여 셋팅 인자값 대입.
        tv2.setChannel(7);
        tv2.setColor("white");
        tv2.setSize(40);
        

        tv2.channelUp();

        System.out.println(tv2);
    }
}
