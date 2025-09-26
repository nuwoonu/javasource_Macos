package ch2.control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=0;
        while(true)
        {
            System.out.println("-------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("-------------------------------------");
            System.out.print("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            if(menu == 1)
            {
                System.out.print ("입금액 >> ");
                // int plus = Integer.parseInt(sc.nextLine());
                // System.out.println(plus);
                balance += Integer.parseInt(sc.nextLine()); //balance 변수에 바로 다이렉트로 대입 --> 코드 간소화
            }
            else if(menu == 2)
            {
                System.out.print ("출급액 >> ");
                // int minus = Integer.parseInt(sc.nextLine());
                // System.out.println(minus);
                balance -= Integer.parseInt(sc.nextLine());
            }
            else if(menu ==3)
            {
                System.out.printf("잔고 >> %d",balance);
                System.out.println();
            }
            else if(menu ==4)
                break;

        }
      
            // switch 경우
            // switch (menu) {
            //     case 1:
            //         System.out.print ("입금액 >> ");
            //         balance += Integer.parseInt((sc.nextLine()));
            //         break;
            //     case 2:
            //         System.out.print ("출급액 >> ");
            //         balance -= Integer.parseInt((sc.nextLine()));
            //         break;
            //     case 3:
            //         System.out.printf("잔고 >> %d",balance);
            //         System.out.println();
            //         break;
            //     case 4:
            //         run=false;
            //         break;
            //     default:
                    // break;
        // }
    }
}
