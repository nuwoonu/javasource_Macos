package lang;
// 래퍼 클래스
// 기본타입 변수를 객체로 다루고자 할 때 사용. 대문자로 시작 
public class WrapperEx1 {
    public static void main(String[] args) {
        // boolean => Boolean
        boolean b = true;
        // Boolean boolean1 = new Boolean(b);
        Boolean boolean1 = Boolean.valueOf(b);
        Boolean boolean2 = false;
        // byte => Byte
        Byte byte1 = 1;
        Byte byte2 = Byte.valueOf((byte) 1); // 인자값 1 ==> int형으로 인식
        
        // char => Chracter
        Character ch = 'a';
        Character ch1 = Character.valueOf('a');
        
        // short => Short
        // int => Int
        Integer.parseInt("15"); //Integer 클래스에 정적 메소드를 사용하여 숫자로 변환
        // long => Long
        Long long1 = 15L;
        Long.parseLong(null);
        // float => Float
        Float float1 = 16.5f;
        // double => Double
        Double double1 = 18.5d;
        Double.parseDouble("172.56"); // ==> 문자를 숫자로
    }
}
