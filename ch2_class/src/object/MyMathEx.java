package object;

public class MyMathEx {
    public static void main(String[] args) {
        MyMath mymath = new MyMath();

        //메소드 호출

        //1 ) 변수에 받기.
        //2 ) 출력문

        long result= mymath.add(12, 63);
        System.out.println(result);
        System.out.println(mymath.add(12, 63));

        result = mymath.subtract(85, 35);
        System.out.println("뺄셈 결과 "+result);

        result = mymath.multiply(9, 9);
        System.out.println("곱셈 결과 "+result);

        double result2 = mymath.divide(20, 4);
        System.out.println(("나눗셈 결과 "+result2));
    }
}
