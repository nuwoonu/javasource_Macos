package inheritance;

public class CaptionTV extends TV{

    boolean caption;
    // super(); super는 부모의 생성자를 호출하는것! 기본생성자 없을때는 아래의 경우로
    public CaptionTV(int size, int channel, boolean power, String color) {
        super(size, channel, power, color);
        
    }
    void displayCaption(String text)
    {
        if(caption)
        {
            System.out.println(text);
        }
    }
    
}
