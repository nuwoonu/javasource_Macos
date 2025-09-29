package object;

public class GoodsStock {
    //속성 : 상품명(p001), 수량(10)

    String name; //멤버 변수
    int amount; //멤버 변수

    //기본 생성자
    
    GoodsStock() // **** 생성자가 아무것도 없을때만 자동으로 만들어짐 **** 매개변수를 갖는 생성자를 만들었을 경우  정의해줘야함!
    {
        
    }

     // public GoodsStock() {
    // }
    
    // 아래 생성자 만든것은 Source action -> add Constructor 사용할 해당 멤버 변수 클릭.
    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }


    //setter, getter 메소드 갖도록

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }

   
    
    
    
    

    
}
