package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class FileEx2 {
    public static void main(String[] args) {
        File currDir = new File("/Users/hyeonwoo/Desktop/temp");

        File[] files = currDir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());

        }
        if (!currDir.exists()) {
            currDir.mkdir();
        }
        File dir = new File("/Users/hyeonwoo/Desktop/temp/dir");
        File file1 = new File("/Users/hyeonwoo/Desktop/temp/dir/file1.txt");
        File file2 = new File("/Users/hyeonwoo/Desktop/temp");
        File file3 = new File("/Users/hyeonwoo/Desktop/temp/file1.txt");
        File file4 = new File("/Users/hyeonwoo/Desktop/temp/file2.txt");
        if (!dir.exists())
            dir.mkdir();
        
            try {
                if (!file1.exists())
                    file1.createNewFile();
                    
                if (!file2.exists())
                    file2.createNewFile();

                if (!file3.exists())
                    file3.createNewFile();

            } catch (IOException e) {
                e.printStackTrace();
            }
            files = currDir.listFiles();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
            for (File file : files) {
                System.out.print(sdf.format(new Date(file.lastModified())));
                System.out.println("\t 날짜      시간        형태       크기      이름");
                System.out.println("==================================================================================");
                if(file.isDirectory())
                {
                    System.out.print("\t<DIR>\t\t"+file.getName());
                }
                else
                {
                    System.out.print("\t\t\t"+ file.length() + "\t" + file.getName());
                }
                System.out.println();
            }

            // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); 이거 해석해보기
            
            //날짜 형식
            // 1. java.util.Date
            // ==> new Date(0);
            // 2. java.time.LocalDate
            // ==> LocalDate.ofEpochDay();

            //  yyyy-MM-dd a(am) HH:mm

    }
}
