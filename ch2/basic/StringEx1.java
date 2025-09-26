package ch2.basic;

public class StringEx1 {
    public static void main(String[] args) {
        //문자열(String) == ""쌍따옴표!
        //String == 대문자 시작시 참조형 
        String str1 = "안녕하세요";
        String str2 = "안녕하세요";

        System.out.println(str1==str2? "문자열이 같음" : "문자열이 다름");
        String str3 = new String("안녕하세요");
        System.out.println(str1==str3 ? "true" : "false");

        String str4 = "abc";
        String str5 = "ABC";
        // equals 는 대소문자 구분해서 true false 반환.
        System.out.println(str4.equals(str5) ? "true" : "false");

        //equlasIgnorecase == 대문자 소문자 무시하고 확인할 때 쓰는 참조
        System.out.println(str4.equalsIgnoreCase(str5) ? "true" : "false");

    }
    
}
