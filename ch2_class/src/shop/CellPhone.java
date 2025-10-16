package shop;

public class CellPhone extends Product{
    
    private String carrier;
    
    public CellPhone(String name, int price,String carrier) { //생성자 생성.
        super(name, price);
        this.carrier = carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    
    

    @Override
    void printExtra() {
        System.out.println("통신사 : "+ carrier);
    }

    


    
    
}
