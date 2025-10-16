package lang;
// Math: 기본적인 수학계산에 사용할 수 있는 메서드로 구성됨
//       모든 메소드가 static 임.
import static java.lang.Math.*;

public class MathEx {
    public static void main(String[] args) {
        // Math.random();
        double val = 90.7552;
        // System.out.println("반올림" + Math.round(val)); //반올림
        // System.out.println("올림" + Math.ceil(val)); //반올림
        // System.out.println("버림" + Math.floor(val)); //반올림
        // System.out.println("PI " +Math.PI);


        System.out.println("반올림" + round(val)); //반올림
        System.out.println("올림" + ceil(val)); //반올림
        System.out.println("버림" + floor(val)); //반올림
        System.out.println("0 <= x < 1"+ random());
        System.out.println("PI " +PI);
        
    }
}
