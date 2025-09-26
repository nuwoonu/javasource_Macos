package ch2.array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= i+1;
        
        }
        // System.out.println(Arrays.toString(arr));
        // int tmp[] = new int[arr.length*2]; //랭스 메소드로 배열 두배 증가 
        // for(int i=0; i<tmp.length;i++)
        // {
            // tmp[i]= arr[i];
        // }
        // System.out.println(Arrays.toString(tmp));

        // out of bound 5 배열 요소 5개를 초과한  에러구문 확인.
        // for (int i = 0; i < tmp.length; i++) {
        //     System.out.println(arr[i]);
        // }


        //배열 복사 방법 2
        // system class method 사용
        // System.arraycopy()
        // int tmp2[] = new int[arr.length*2];
        // System.arraycopy(arr, 0, tmp2, 0,arr.length);
        // System.out.println(Arrays.toString(tmp2));

        char abc[] = {'A','B','C','D'};
        char num[] = {'0','1','2','3','4','5','6','7','8','9'};

        // char tmp[] = new char[14];
        char result[] = new char[abc.length+num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
        

    }
}
