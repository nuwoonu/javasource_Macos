package lang;
// Throwable
// Exception(예외)

// 종류
// 1) 컴파일 예외 : ClassNotFoundException 
// 2) 런타임 예외 : ArithmeticException 실행해야 아는것
// 어떤 예외가 나던 하나의 처리방법을 쓰면된다.
// 처리방법
// 1) 예외 처리
//   try - catch 문 이용
//   catch 하나로 모든 exception 처리 or 개별 처리 or 논리식 |(or)를 사용하여 여러개 사용
//   try - catch - finally
//   finally{ exception 발생여부와 상관없이 꼭 실행해야할 코드 작성}
//   try - finally
// 2) 예외 던지기
//  메소드 () thros 예외명 , 예외명

// 강제 Exception 발생시키기
// 사용자 정의 예외 상황
// throw new ___Exception()

// Error

public class ExceptionEx1 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(4/0);

        findClass();
    }
    public static void findClass() throws ClassNotFoundException
    {
        Class.forName("null");

    }
}
