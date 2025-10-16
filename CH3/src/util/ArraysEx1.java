package util;

import java.util.Arrays;

// java.util.Arrays : 배열을 조작하기 쉽게 다양한 메소드 제공.
// public static <T> T[] copyOf(T[] original, int newLength)
// T,K,V,E[] : 객체(참조타입) 쓰라는 의미. 
public class ArraysEx1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] newArr = new int[7];
        // 배열복사
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.arraycopy(arr,0,newArr,0,0);

        int[] copyArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copyArr)); 

        int[] copyArr2 = Arrays.copyOfRange(arr, 1, 3);
        System.out.println(Arrays.toString(copyArr2));
    }
    
}
