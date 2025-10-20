package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {
        // File file = new File("/Users/hyeonwoo/Desktop/temp/file1.rtf");
        // File file = new File("/Users/hyeonwoo/Desktop/temp","file1.rtf");
        File parent = new File("/Users/hyeonwoo/Desktop/temp");
        File file = new File(parent,"file1.rtf");
        //** Windows os : \n,\t ==> 경로지정하는 것과 구별하기 위해서 \\ 두번 사용해야한다. **
        String name = file.getName();
        int pos = name.lastIndexOf(".");

        System.out.println("파일명 " +name );
        //확장자를 제외한 이름을 추출 하는 방법
        System.out.println("확장자를 제외한 이름 "+ name.substring(0, pos));
        System.out.println("확장자" +name.substring(pos+1)); // 확장자 알고싶을때.
        System.out.println("경로를 포함한 파일명 "+ file.getPath());
        System.out.println("파일이 속해 있는 디렉토리 "+file.getParent());
        System.out.println("파일 pathSeparator "+ File.pathSeparator); // 운영체제에 따른 경로 차이가 있으므로 나눠준다.
        System.out.println("파일 pathSeparatorChar "+ File.pathSeparatorChar);
        System.out.println("파일 separator "+ File.separator);
        System.out.println("파일 separatorChar "+ File.separatorChar);
        

    }
}
