package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        //리스트 생성
        List<String> list1 = new ArrayList<>(30); //요소의 공간을 따로 지정 가능 파라미터 안주면 기본 값 10
        ArrayList<String> list2= new ArrayList<>(); // 자식 멤버변수 = new 자식 선언가능
        List<String> list3 = List.of("사과","포도","딸기","수박");
        
        //배열로 리스트 생성하기
        String[] fruits = {"사과","포도","딸기","수박"};
        List<String> list4 = Arrays.asList(fruits); // 배열을 리스트로 바꿀때. 배열은 뒤에 추가가 불가능하여 삽입,삭제 시 예외경고문구가 뜬다.

        list1.add("사과");

        list2.add("사과");

        // list3.add("바나나");
        // list4.add("바나나"); //UnsupportedOperationException
        // list4.remove(0);

        //배열을 add 사용 하여 변경할 때
        // new를 사용해서 메모리를 확정하여 처리한다.
        String[] fruits2 = {"사과","포도","딸기","수박"};
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");
        System.out.println(list5);


        List<String> list6 = new ArrayList<>(List.of("사과","포도","딸기","수박"));
        list6.add("바나나");
        System.out.println(list6);
        
    }
}
