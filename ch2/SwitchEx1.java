package ch2;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        //현재 월 입력받기.
        Scanner sc = new Scanner(System.in);
        System.out.println("현재의 월을 입력해주세요 : ");
        int month = Integer.parseInt(sc.nextLine());
        switch(month)
        {
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
            break;
            case 6:
            case 7:
            case 8:
                System.out.println("현재의 계절음 여름입니다.");
            break;
            case 9:
            case 10:
            case 11:
                System.out.println("현재의 계절은 가을입니다.");
            break;
            case 12:
            case 1:
            case 2:
                System.out.println("현재의 계절은 겨울입니다.");
            break;
            default :
                System.out.println("다시 입력하세요.");
            break;
        }
    }
}
