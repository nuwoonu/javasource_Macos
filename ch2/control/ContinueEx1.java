package ch2.control;

public class ContinueEx1 {
    // Continue문은 Continue를 만나면. 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
    public static void main(String[] args) 
    {
        // 1~ 10사이 출력 단 3의 배수는 제외.
        for(int i=0; i<11;i++)
        {
            if(i % 3== 0)
                continue;
            System.out.println(i);
            //컨티뉴는 다 뛰어넘고 for문 조건식으로 바로 실행.
        }
    }
}
