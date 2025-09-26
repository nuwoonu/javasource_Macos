package ch2.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        // 타입 배열명[] = new 타입[공간];
        // 타입[] 배열명 = new 타입[공간];
        // 타입: 기본형(int,long,float,double,boolean,char) 참조형(String,Array)
        // 한번 선언시 길이 변경 불가능.
        int arr1[] = new int[10];
        System.out.println(arr1[3]);

        double arr2[] = new double[5];
        System.out.println(arr2[0]);

        boolean arr3[] = new boolean[3];
        System.out.println(arr3[1]);

        char arr4[] = new char[3];
        System.out.println(arr4[0]+"arr");

        int[] arr5; //배열 선언
        arr1 = new int[3]; //배열 요소 생성.
        
        
        // 배열 선언,생성,초기화 
        int score[] = {88,90,87,86,77,78,79,75,72,76};
        
        // int sum = score[0]+score[1]+score[2]
        int sum=0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];

        }
        System.out.println("총합"+sum);
        System.out.println("평균"+sum / score.length);
        

    }
}
