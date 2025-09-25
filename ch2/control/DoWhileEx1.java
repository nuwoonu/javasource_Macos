package ch2.control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // int i=10;
        // do {
        //     System.out.println(i);
        // } while (i<10);

        //1 ~ 100 사이의 정수 입력
        // 컴퓨터 임의이수 : 1~ 100 사이의 정수
        // 컴퓨터가 생성한 임의의 수 맞추기
        Scanner sc = new Scanner(System.in);
        int com = (int)(Math.random() * 100) +1 ;
        int user=0;
        do {
            System.out.println("1~100 사이의 숫자를 입력하시오 : ");
            user = Integer.parseInt(sc.nextLine());
            
            if(user<com)
            {
                System.out.println("더높은 수로 시도해보세요.");
            }
            else if(user>com)
            {
                System.out.println("더 작은수로 시도해보세요.");
            }
        } while (com != user);
        System.out.println("정답입니다.");        
    }
}
