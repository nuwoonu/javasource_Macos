package object;

public class DataEx {

    public static void main(String[] args) {
        Data data = new Data(); //heap 공간에 주소값을 갖는 것을 생성 
        data.x= 10;
        change(data.x);
        System.out.println("change 호출 후  : "+ data.x);
        change(data);
        System.out.println("change (Data d) : "+data.x);

        Data data2=copy(data); //copy(data) == 주소가 복사가 일어남
        System.out.println("data2.x = "+ data2.x);
    }
    
    public static Data copy (Data d) //Data라는 클래스를 리턴타입으로 사용
    {
        Data tmp = new Data(); //tmp 새로운 주소를 만듦 예 : 0x200
        tmp.x = d.x; //값의복사가 일어남
        return tmp; //주소를 리턴한 예제 주소도 리턴을 할 수 있다. 참조형(String, [] , 클래스 )
    }


    public static void change(int x) //변수 값만 보낸것!. 주소값을 보낸것이아님.
    {
        x= 15;
        System.out.println("변경 후 : "+ x);
    }
    public static void change(Data d) // 원본값을 건들이려면 대문자로 시작하는 타입!
    {
        d.x = 15;
        System.out.println("변경 후 : "+ d.x);
    }
}
