package util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx3 {
    public static void main(String[] args) {
        // int[] arr = {37,21,56,99,88,58,62,15,39,78};
        Integer[] arr = {37,21,56,99,88,58,62,15,39,78};
        // 정렬 - 선택정렬, 버블정렬, 퀵정렬...

        Arrays.sort(arr); //기본 오름차순
        System.out.println("오름차순 정렬 후");
        System.out.println(Arrays.toString(arr)); 
        

        // 내림차순 정렬
        // Arrays.sort(T[] a , Comparator<? super T>c)
        Arrays.sort(arr,Comparator.reverseOrder());// int를 참조타입으로 선언하면 원본을 바꿔버림 참조타입
        System.out.println("내림차순 정렬 후");
        System.out.println(Arrays.toString(arr));

        String[] arr2 = {"good","height","dog","lion","cat","zero","zoo"};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2,Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));

        
    }
}
