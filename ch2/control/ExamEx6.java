package ch2.control;

public class ExamEx6 {
    public static void main(String[] args) {
        // 중첩 for 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y)형태로 출력 
        // 단 x와 y는 1~10사이의 자연수
        for(int x=1;x<=10;x++)
        {
            for(int y=1;y<=10;y++)
            {
                if((4*x)+(5*y) ==60)
                {
                    System.out.printf("60의 해는 x=%d , y=%d 입니다\n",x,y);
                }
            }
        }
    }
}
