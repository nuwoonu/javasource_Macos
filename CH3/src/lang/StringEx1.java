package lang;
public class StringEx1 {
    public static void main(String[] args) {
        // String str1 = new String("abc"); // 인스턴스 생성
        String str1 = "abcdefegd";
        
        //문자열을 낱개로 처리 : 문자열 => 문자로
        
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));           
        }
        char[] ch = {'A','B','C','D'}; //문자 ==> 문자열로
        String str2 =  new String(ch);
        System.out.println(str2);
    }
}
