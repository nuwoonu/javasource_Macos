package ch2;

import java.util.Scanner;

public class ExamEx4 { 
    // 사칙연산 계산기
    // 두개의 숫자 받고 사칙연산 입력 받아 출력!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 정수를 입력하세요 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        int result=0;
        System.out.println("사칙연산을 입력하세요");
        String op = sc.nextLine();

        switch (op) {
            case "+":
                result = input+input2;
                break;
            case "-":
                result = input - input2;
                break;
            case "*":
                result = input * input2;
                break;
            case "/":
                result = input / input2;
            default:
                break;
        }

        // if문으로 바꿔볼것!
        if (op == "+")
        {
            result = input + input2;
            
        }
        else if(op == "-")
        {
            result = input - input2;
        }
        else if(op == "*")
        {
            result = input * input2;
        }
        else if(op == "/")
        {
            result = input / input2;
        }
        else
        {
            System.out.println("다시 입력해주세요");
        }
        System.out.printf("%d %s %d = %d",input ,op ,input2, result);
        sc.close();
    }
}
