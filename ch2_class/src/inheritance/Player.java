package inheritance;

// 부모의 역할로만 사용할 추상클래스
// 멤버변수, 메소드 사용가능.
// .(접근연산자)로 가능한게 부모가 정의한것만 가능.
public abstract class Player {
    boolean pause;
    int currentPos;

    final int num =0;

    
    public Player(boolean pause, int currentPos) {
        this.pause = pause;
        this.currentPos = currentPos;
    }

    public Player() {
    }
    
    abstract void play(int pos);
    abstract void stop();

    void pause(){
        if (pause)
        {
            pause =false;
            play(currentPos);
        }
        else
        {
            pause =true;
            stop();
        }
    }

}
