package ch2.array;

import java.net.Socket;
import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        /* 
        String[] strArr = {"Kim","Park","Yi"};
        
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr[0].length()); //배열의 길이(공간) 출력
        */


        //char 배열과 String 배열 
        // String : char 배열에  + 기능 (메서드)
        String[] strArr2 = new String[3];
        strArr2[0]="Kim";
        strArr2[1]= new String("Park");
        strArr2[2]="Yi";

        // System.out.println(strArr2[0].charAt(0));
        String src ="ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i)); //String 배열을 char로 쪼갤때 쓰는 메서드.
        }
        
        char[] chArr = src.toCharArray(); //char 배열을 String(문자열)로 만들때 쓰는 메서드


        char[] chArr1 = {'A','B','C','D','E'};
        String str2 = new String(chArr);
        System.out.println(str2);
    }
}
