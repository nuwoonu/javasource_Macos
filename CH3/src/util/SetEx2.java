package util;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1~ 45 => 6개 숫자를 무작위로 추출
        // List, Set

        Set<Integer> set = new HashSet<>();

        for(int i=0;set.size()<6;i++)
        {
            int num = (int)(Math.random()*45)+1;
            set.add(num);
            
        }
        System.out.println(set);
        
        // 정 렬
        // set => list 변환
        List<Integer> list = new LinkedList<>(set);

        // public static <T extends Comparable<? super T>> void sort(List<T> list)
        // public static <T extends Comparable<T>> void sort(List<T> list)
        //  <T extends Comparable<T>> : T는 Comparable를 구현한 클래스여야 한다. 그리고 T또는 T의 


        // ---이런 모양---
        // class Person implements Comparable {}
        // class Student extends Person 
        // Person(부모)
        //  T: Student
        list.forEach(null);
        
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(null, null);

        // list => set 변환
        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);


        //Collections.srot(apples, Comparator<Apple>) : Apple Fruit, Object
    }
}
