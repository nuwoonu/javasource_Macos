package inheritance;

public class Fighter implements Fightable // 인터페이스를 부모로 사용할땐 키워드가 extands가 아닌 implements로 사용
{

    @Override
    public void move(int x, int y) {
        System.out.println("move");
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("attack");
    }
    
}
