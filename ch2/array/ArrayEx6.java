package ch2.array;

import java.util.Arrays;

public class ArrayEx6 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하기 위한 배열 생성
        // 각 요소 1~45값 저장(랜덤).
        // 배열의 0번째에서 5번째 요소까지
        // 교환요소에 : 0~44 무작위 수
        // 모두 6개만 교환
        
        int arr[]= new int[45];
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = i+1; //배열 요소에 0~45 값 1씩 증가하면서 채움.
        }
        System.out.println(Arrays.toString(arr));
        int n=0;
        for(int i=0; i<6;i++)
        {
            n = (int) (Math.random()*45); //44까지의 무작위수
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < 6; i++) 
        {
            System.out.printf("arr[%d] = %d \n",i,arr[i]);
        }
    }
}
