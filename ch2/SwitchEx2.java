package ch2;

import java.util.Scanner;

public class SwitchEx2 {
    public static void main(String[] args) {

        System.out.print("가위(1) 바위 (2) 보(3) 중 하나를 입력하세요 >> ");
        Scanner sc = new Scanner(System.in);
        
        int user = Integer.parseInt(sc.nextLine());

        int com = (int)(Math.random() * 3) +1 ; // 0~1미만의 구간의 double형 난수 생성.
        // System.out.println(com);

        switch (user - com) 
        {
            case 2: 
            case -1:
                System.out.println("You lose");
                break;

            case 1:
            case -2:
                System.out.println("You win");
                break;
            case 0:
                System.out.println("비겼습니다.");
                break;
            
            default:
                System.out.println("정확한 숫자를 입력하세요 : ");
                break;
        }
        System.out.println("컴퓨터가 낸 것은 "+ com+" 입니다. ");
                
    }
}
