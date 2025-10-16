package lang;
// NotExistIdException , WrongPasswordException

public class LoginEx {
    public static void main(String[] args) {
        
        try {
            login("white", "12345");
            login("blue", "54321");
        } catch (NotExistIdException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    // login 예외처리

    public static void login(String id, String password) throws NotExistIdException, WrongPasswordException
    {
        if(!id.equals("blue")); // id가 blue가 아니라면 NotExistIdException 발생
        {
            throw new NotExistIdException("아이디 확인");
        }
        
        // if(!password.equals("12345"))
        // {
        //     throw new WrongPasswordException("비밀번호 확인");
        // }
        // passwor 가 "12345" 가 아니라면 WrongPasswordException 발생


    }
}
