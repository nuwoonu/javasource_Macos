package ch2;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 정수를 입력하세요 : ");
        int input1 = Integer.parseInt(sc.nextLine());
        System.out.print("세번째 정수를 입력하세요 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        
        int min=input;

        if(min > input1)
            min = input1;
        if(min >input2)
            min = input2;
        System.out.printf("세개의 정수 중 가장 작은 값은 %d입니다.\n ",min);

        // 큰수의 경우

        // int max = input;
        // if(max < input1)
        //     max = input1;
        // if(max <input2)
        //     max = input2;
        // System.out.printf("세개의 정수 중 가장 작은 값은 %d입니다.\n ",max);
        sc.close();
    }
}
