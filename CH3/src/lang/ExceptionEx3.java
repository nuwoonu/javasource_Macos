package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // 1.NullPointerException
        String str = null; //null 은 참조타입(대문자 시작 타입)에서만 사용.
        Value v = null;
        System.out.println(str);
        
        if (str !=null) {
            System.out.println(str.length());    
        }
        // 2. ArrayIndexOutOfBoundsException 범위 밖으로 지정되거나 찾을때 뜨는 예외문.
        if (args.length ==1)
        {
            String data1 = args[0];
            System.out.println(data1);
        }
        
        // 3. NumberFormatException
        
        try {
            //exception 발생할 가능성이 있는 코드
            String data2 = args[0];
            String data1 = "a100";
            int value1 = Integer.parseInt(data1);
            System.out.println(value1);

        } catch (NullPointerException e) { //전체적으로 쓴다면 Exception 예약어만 사용할것.
            //exception 발생하면 해야 하는 작업 (발생하지 않으면 그냥 넘어감.)
            // e.printStackTrace(); // 예외사항 추적
            System.out.println(e.getMessage()); //이거 많이 쓸거같음. 이유를 알려주는것.
            System.out.println("입력값 확인");
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("인자 확인");
        }

        // 4. ClassCastException
        Dog dog = new Dog();
        changeDog(dog);
        Cat cat = new Cat();
        changeDog(cat);
    }
    public static void changeDog(Animal animal) //런타임 캐스팅이 발생했을때 비교하고 예외처리
    {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;    
        }
        
    }
}
