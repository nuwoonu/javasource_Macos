package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        //시스템 날짜아 시간을 가져올 때
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); // yyyy ==> 년도를 4자리로 표현 MM= 월 mm(소문자) = min 
        System.out.println(sdf.format(date));
    }
}
