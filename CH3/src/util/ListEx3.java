package util;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        //Member 객체를 List 에 담기
        
        List<Member> list1 = new ArrayList<>();
        list1.add(new Member("hong12", "hong12", "홍길동")); //[0]
        list1.add(new Member("hong13", "hong13", "홍길동")); //[1]
        list1.add(new Member("hong14", "hong14", "홍길동")); //[2]
        list1.add(new Member("hong15", "hong15", "홍길동")); //[3]

        //2번째 멤버 조회
        Member member = list1.get(1);
        System.out.println("이름 " + member.getName());

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("아이디\t비밀번호\t이름");
        System.out.println("----------------------------");
        //전체 Member 조회
        for (Member mem : list1) { // 이걸 주로 사용
            System.out.printf("%s\t%s\t%s\n",mem.getId(),mem.getPassword(),mem.getName());
        }
        System.out.println();

        for (int i = 0; i < list1.size(); i++) { //list 에서는 length()안쓰고 size() 메서드를 쓴다. for i로 사용시
            Member mem = list1.get(i);
            System.out.printf("%s\t%s\t%s\n",mem.getId(),mem.getPassword(),mem.getName());
        }
    }
}
