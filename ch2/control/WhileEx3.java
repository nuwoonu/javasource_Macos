package ch2.control;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        boolean flag = true;
        while(flag)
        {
            System.out.println("합계를 구할 숫자를 입력하세요. : ");
            int num = Integer.parseInt(sc.nextLine());
            
            if(num!=0)
            {
                sum += num;
            }
            else
            {
                flag = false;
            }
                
        }
        System.out.println("합계 = " + sum);
    }
}
