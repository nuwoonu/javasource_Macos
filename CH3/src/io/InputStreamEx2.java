package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class InputStreamEx2 {
    public static void main(String[] args) {
        
    // Stream : 통로
    // 바이트 단위로 처리 (모든 종류의 파일) ~~InputStream / ~~~OutputStream
    // 문자 단위로 처리(텍스트 파일) : ~~Reader / ~~Writer

    // InputStream : 추상 클래스
    //  abstract int read() : 한바이트를 읽어 int로 리턴
    //  int read(byte[] b) : byte[] 만큼 읽어오고 읽어온 데이터 수 반환
    //  int read(byte[] b, int off, int len) 

    // Reader 
    // int read()
    // int read(char[] b)
    // abstract int read(char[] b, int off, int len)

    // OutputStream
    // abstract void write(int b)
    // void write(byte[] b)
    // void write(byte[] b,int off, int len)

    // Writer
    // void write(int b)
    // void write(char[] b)
    // void write(char[] b, int off, int len)
    // void write(String str)
    // void write(String str,int off, int len)

    // InputStream == 바이트단위로 읽어오기
    // FileInputStream == 파일에서 바이트 단위로 읽어온다.
    
    // OutputStream
    // FileOutputStream...

    // Reader
    // FileReader...

    // Writer
    // FileWriter..

    // 성능향상 보조스트림
    // BufferedInputStream + ~~InputStream
    // BufferedOutputStream + ~~OutputStream
    // BufferedReader + ~~Reader
    // BufferedWriter + ~~Writer

        try {
            InputStream in = new FileInputStream("/Users/hyeonwoo/Desktop/temp/img1.jpg"); // in이라는 이름(변수)으로 통로하나 열은 것과 같음
            OutputStream out = new FileOutputStream("/Users/hyeonwoo/Desktop/temp/copy2.jpg");
            int input = 0;
            byte[] bytes = new byte[1024];
            while ((input = in.read(bytes))!= -1) {
                // System.out.print((char)input);
                out.write(bytes);    
            }
            in.close();
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        // catch (IOException e) // FileNotFoundException, IOException 처리가능
        // {
        //     e.printStackTrace();
        // }
        
    }
}
