package ch2.control;

public interface ForEx2 {
    public static void main(String[] args) {
        
        // for(int i=0;i<10;i++)
        // {
            // if(i%2==0)
            // {
            //     System.out.print(i+" "); // 짝수 출력.
            // }

            // System.out.print(i+" "); // 짝수 출력.
        // }
        // for(int i=0;i<10;i++)
        // {
        //     if(i%2==1)
        //     {
        //         System.out.print(i+" "); // 홀수 출력.
        //     }
        // }
        for(int i=0;i<10;i++)
        {
            System.out.printf("3 * %2d = %2d\n",i,(3*i));
        }
    }
}
