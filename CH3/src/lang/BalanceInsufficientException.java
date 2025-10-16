package lang;

// Exception : 컴파일 예외사항
// RuntimeException : 실행할 때 예외 발생

public class BalanceInsufficientException extends RuntimeException
{
    // public BalanceInsufficientException(){
        
    // }
    // public BalanceInsufficientException(String message){
    //     super(message);
    // }

    public BalanceInsufficientException(){
        
    }
    public BalanceInsufficientException(String message){
        super(message);
    }
}