package ch2.control;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        int sum=0;
        while(num!=0)
        {
            sum = sum + num % 10; // 3
            System.out.printf("sum = %3d num = %d\n",sum,num);
            num = num /10;
        }
        System.out.println("각자리수의 합은 : "+sum);
    }
}
