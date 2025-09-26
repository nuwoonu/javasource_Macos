package ch2.array;

public class ArrayEx8 {
    public static void main(String[] args) {
        
        /*
        int[][] score = new int[3][4];
        score[0][0] = 78;
        score[1][1] = 68;
        
        System.out.println(score.length); //행의 길이
        System.out.println(score[0].length); //열의 길이

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j]+"\t"); // 2차월배열 for문 출력
            }
            System.out.println();
        }

        int[][] arr ={ //또다른 형태의 2차원 배열 선언.
            {1,2,3}, //1행
            {4,5,6}  //2행
        };

        */
        //가변 배열 비정형화된 배열. ex) 3x3 이런배열이 아닌구조.
        int[][] arr2 = new int[3][];
        arr2[0] = new int[2];
        arr2[0] = new int[3];
        arr2[2] = new int[2];

        //학생별 과목별 기록.

        int [][] jumsu ={
            {100,100,100},
            {20,50,40},
            {30,60,50},
            {80,70,60},
            {60,80,70},
        };

        int korTotal =0, engTotal =0 , mathTotal=0;
        System.out.printf("번호\t  국어\t  영어\t  수학\t  총점\t  평균 \n");
        System.out.println("=============================================================");
        System.out.println(jumsu.length);
        for(int i=0;i<jumsu.length;i++)
        {
            System.out.printf("%3d \t",i+1);

            //개인별 총점,평균 변수
            int sum = 0;
            float avg = 0.0f;
            korTotal += jumsu[i][0]; //열번호 고정해서 행만 바꾼 값을 각 과목에 대입.
            engTotal += jumsu[i][1];
            mathTotal+= jumsu[i][2];


            for(int j=0;j<jumsu[i].length;j++) //열 구간
            {
                sum += jumsu[i][j];
                System.out.printf("%5d \t", jumsu[i][j]);
            }
            avg = sum / (float) jumsu[i].length;
            System.out.printf("%5d\t %5.1f",sum,avg);
            System.out.println();
        }
        System.out.println("=============================================================");
        System.out.printf("각 과목별 총점 : 국어 : %3d  영어 : %3d 수학 : %3d \n",korTotal,engTotal,mathTotal);
        System.out.println("=============================================================");
    }
    // 과목별 (행)총점 
}
