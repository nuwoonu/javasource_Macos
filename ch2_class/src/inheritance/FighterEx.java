package inheritance;

// 추상 클래스, 인터페이스는 직접적으로 인스턴스 생성불가 == (new 메소드() 형태 사용불가)
// 부모의 목적으로만 사용
public class FighterEx {
    public static void main(String[] args) {
        // Attackable attackable = new Attackable();
        Fightable fightable = new Fighter();
        Fighter fighter = new Fighter();
        
    }
}
