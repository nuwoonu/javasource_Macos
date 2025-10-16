package lang;

public class ExceptionEx5 { // Multi Catch
    public static void main(String[] args) {
        try {
            //exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);

        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) { 
            System.out.println("인자값을 확인하거나 입력값 확인");
        } catch(Exception e)
        {
            System.out.println("인자 확인");
        }
    }
}
