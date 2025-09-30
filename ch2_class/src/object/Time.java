package object;

public class Time {
    private int hour;
    private int minute;
    private int second;


    // 시,분,초는 모두 0 보다 크거나 같아야 한다.
    // 시의 범위는 0~23, 분,초의 범위는 0~59
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if(hour<0 || hour>23) 
            return; //아무것도 없는 값을 리턴(반환)하여 밑에 구문을 실행하지 않음. like break의 형태
        this.hour = hour;
        
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if(minute< 0 || minute >59)
            return;
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if(second< 0 || second > 59)
            return;
        this.second = second;
    }

    
    

}
