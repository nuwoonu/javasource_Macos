package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(); // List<객체만 기본타입 못담음.> 멤버변수 = new 생성자<>(); <>의미 == 제네릭스
        List<String> list2 = new LinkedList<>();

        long startTime = System.currentTimeMillis(); //ms 단위
        // long startTime2 = System.nanoTime(); //ms 단위

        for (int i = 0; i < 10000; i++) {
            list1.add(0,String.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Array List 걸린 시간 : " + (endTime- startTime) + "ms");
        
        for (int i = 0; i < 10000; i++) {
            list2.add(0,String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linked List 걸린 시간 : " + (endTime- startTime) + "ms");
    }
}
