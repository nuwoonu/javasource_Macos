package ch2;

import java.util.Scanner;

public class ExamEx3 { 
    // 하루 일당 산출
    // 8 시간까지는 10030₩
    // 8 시간 이후에는 원래 받던 금액의 1.5배
    // 근무시간 입력 받은 후 하루 일당 산출.
    // 금액은 정수 형태
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("근무 시간을 입력하세요 : ");
        int hours = Integer.parseInt(sc.nextLine());
        int rate=10030, pay=0;
        if(hours >8)
        {
            pay = rate * 8 +(int)((hours-8)*rate *1.5);
        }
        else   
        {
            pay = rate * 8;
        }

        System.out.printf("근무시간 %d, 임금 : %d",hours,pay);
        sc.close();
    }
}
