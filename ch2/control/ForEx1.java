package ch2.control;

public interface ForEx1 {
    public static void main(String[] args) {
        // for (int i = 0; i < 10; i+=2) {
        //     System.out.println(i);            
        // }
        // for(int i=1; i<=10;i++)
        // {
        //     System.out.print(i + " ");
        // }

        // 1~10 합계 구하기.
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            sum+= i;
            System.out.println("1~10까지의 합 : "+sum);
        }
    }
}
