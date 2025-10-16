package inheritance;

public class PlayerEx {
    public static void main(String[] args) {
        Player player = new CDPlayer(); //부모 자식으로 인스턴스 생성하는경우
        CDPlayer cdPlayer = new CDPlayer(); // 자식으로 인스턴스 생성

        player.pause = true;
        player.currentPos = 7;
        
        //상속에서의 다형성 : 오버라이딩 시 자식 클래스의 메소드가 실행되는 의미.
        player.play(8);
        player.stop();

        cdPlayer.currentPos = 8;
        cdPlayer.pause = false;
        cdPlayer.currentTrack = 9;
        cdPlayer.play(1);
        cdPlayer.nextTrack();
    }
}
