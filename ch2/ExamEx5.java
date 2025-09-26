package ch2;

import java.util.Scanner;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개 던진다 나오는 눈의 합이 5가 아닌경우 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위 실행 멈춤        
        
        while(true)
        {
            int dice1 = (int)(Math.random() * 6) +1 ;
            int dice2 = (int)(Math.random() * 6) +1 ;
            int dice_sum = dice1+dice2;

            System.out.printf("첫번째 주사위 눈 = %d \t 두번째 주사위 눈 = %d\n",dice1,dice2);
            if(dice_sum==5)
            {
                System.out.println("눈의 합이 5가 되었습니다. "+"Sum = "+dice_sum);
                break;
            }
                

        }
    }
}
