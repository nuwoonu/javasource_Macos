package ch2.control;

public interface ForEx3 {
    public static void main(String[] args) {
        
        // for(int i=0;i<5;i++) // 행을 담당
        // {  
        //     for(int j=0;j<=i;j++) // 열을 담당.
        //     {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        for (int i=2;i<=9;i++)
        {
            for(int j=1;j<=9;j++)
            {
                System.out.printf("%d * %d = %d",i,j,i*j);
                System.out.println();
            }
            
        }
 }
}
