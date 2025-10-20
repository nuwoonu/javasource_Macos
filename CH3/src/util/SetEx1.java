package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // !!!set구조는 중복 요소를 저장하지 않는다!!!
                                            // 저장 순서를 유지하지 않는다. [i] 이런 요소 자체를 볼 수 없다.
        //추가: add
        set1.add("사과");
        set1.add("귤");
        set1.add("수박");
        set1.add("멜론");
        set1.add("키위");
        set1.add("배");
        set1.add("감");
        set1.add("감");
        System.out.println(set1);

        // 삭제
        set1.remove(("수박"));
        System.out.println(set1);

        // 수정 : 불가, 중간삽입 : 불가
        // set1.set() 불가

        //전체 조회
        for (String str : set1) {
            System.out.println(str);
        }

        //특정 조회
        // set1.get() X
        Iterator<String> iterator = set1.iterator();

        // hasNext() : 다음에 가져올 객체 있으면 true, 없으면 false
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);


        }
    }
}
