package ch2.array;

import java.util.Arrays;

public class ArrayEx5 {
    public static void main(String[] args) {
        //10개 정수를 담는 배열선언
        //0~9 숫자로 초기화

        // int num [] = {0,1,2,3,4,5,6,7,8,9};

        int arr [] = new int[10];
        for(int i=0;i<arr.length; i++)
        {
            arr[i] =i;
        }


        // for (int i = 0; i < arr.length; i++) {
        //     arr[i]=i;
        // }   
        // System.out.println(Arrays.toString(arr));

        // int x=10,y=5,temp;
        // temp =x;
        // x=y;
        // y=temp;

        // 0~9 사이의 임의의 수 추출
        int n=0;
        for (int i = 0; i < 100; i++) {
            n = (int)(Math.random() * 10);
            int temp = arr[0];
            arr[0]=arr[n];
            arr[n]= temp;
            
            
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
