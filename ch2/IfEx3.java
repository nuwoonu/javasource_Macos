import java.util.Scanner;

public class IfEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int score = Integer.parseInt(sc.nextLine());

        char grade = ' ',opt = '0';
        if(score >= 90)
        {
            grade = 'A';
            if(score >=98)
            {
                opt = '+';
            }
            else if(score <95)
            {
                opt = '-';
            }
            else
            {
                if(score <=80)
                {
                    grade = 'B';
                    if(score >=88)
                    {
                        opt = '+';
                    }
                    else if (score <85)
                    {
                        opt = '-';
                    }
                }
            }
            System.out.printf("당신의 학점은 %c%c입니다", grade , opt);
        }

    }
    
}
