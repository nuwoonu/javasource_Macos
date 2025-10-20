package util;

import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();


        //추가
        list.add("사과");
        list.add("귤");
        list.add("수박");
        list.add("멜론");
        list.add("키위");
        list.add("배");
        list.add("감");

        System.out.println(list);

        //삭제
        list.remove(2);
        System.out.println("삭제후 "+list);

        //수정
        list.set(0,"포도");
        System.out.println(list);

        //조회
        System.out.println(list.get(3));

        for (String str : list) {
            System.out.println(str);
        }
        
    }
}
