package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class LIstEx1 { //!!! 리스트 사용법 !!!
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(); // 리스트에는 순서가 존재한다. 
        // 추가 add => append
        list1.add("사과");
        list1.add("귤");
        list1.add("수박");
        list1.add("멜론");
        list1.add("키위");
        list1.add("배");
        list1.add("감");

        System.out.println(list1);
        System.out.println(list1.get(3)); //순서가 있기때문에 [0],[1],[2],[3] 3있는곳의 위치를 갖고온다. 읽어오는것
        
        System.out.println("리스트 요소 갯수"+list1.size());
        // remove
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);

        //특정위치의 요소값 변경
        list1.set(0, "포도");
        System.out.println(list1);

        list1.add(2, "딸기");
        System.out.println(list1);

        for (String string : list1) { //요소 하나하나씩 뺴오기 가능
            System.out.println(string);
        }

        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
