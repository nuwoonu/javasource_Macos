package lang;
// 다중 catch문
public class ExceptionEx4 {
    public static void main(String[] args) {
        
        try {
            //exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);

        } catch (NullPointerException e) { 
            System.out.println("입력값 확인");
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("인자 확인");
        }
        catch(Exception e) //순서 중요!! Exception은 부모(NullPointer,ArrayIndex) 이기때문에 맨밑에 있어야한다
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("프로그램 재실행");
        }

        try
        {
            String data3 = args[0];
        }
        catch(ArrayIndexOutOfBoundsException e)
        {

        }
        try
        {
            String data1 = "100";
            int value1 = Integer.parseInt(data1);
        }
        catch(NullPointerException e)
        {

        }

    }
    
}
