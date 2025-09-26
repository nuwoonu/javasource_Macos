package ch2;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {

        System.out.print("가위(1) 바위 (2) 보(3) 중 하나를 입력하세요 >> ");
        Scanner sc = new Scanner(System.in);
        
        int user = Integer.parseInt(sc.nextLine());

        int com = (int)(Math.random() * 3) +1 ; // 0~1미만의 구간의 double형 난수 생성.
        System.out.println(com); 
    }
}
