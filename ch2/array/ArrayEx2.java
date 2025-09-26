package ch2.array;

import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        char arr1[] = {'a','b','c','d'};
        double arr2[] = {99.8,85.2,77.8,63.8};
        String arr3[] = {"bear","snow","sun"};

        // 1~10 임의의 수 생성 후 초기화
        int arr4[] = new int[10];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = (int)(Math.random()*10)+1; //각 배열 요소 10번 돌아가면서 1~10까지의 랜덤값으로 초기화.
        }
        // 배열의 갯수가 명확하지 않을때  ==> 입력값으로 결정.
        int arr5[];
        Scanner sc = new Scanner(System.in);
        System.out.println("배열길이 입력");
        int length = sc.nextInt();
        arr5 = new int[length];

        // 배열 변수 바로 호출시 문자만! 제대로 보여줌.
        // ----- Call by Value 하려면 -----
        // Arrays.toString()
        // System.out.println(arr1);
        // System.out.println(arr2);
        // System.out.println(arr3);
        // System.out.println(arr4);
        // System.out.println(arr5);
        
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));
        // System.out.println(Arrays.toString(arr4));
        // System.out.println(Arrays.toString(arr5));
        
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
            
        }


        // 향상된 for 차례대로 호출하는것! [0]요소 부터 쭉----
        for (String str : arr3) 
        {
            System.out.println(str);
        }
        for (char ch : arr1) 
        {
            System.out.println(ch);
        }
    }
}
