package lang;
// String
// StringBuilder => mutable(원본 변경가능)
// StringBuffer(멀티쓰레드) ,StringBuilder(단일쓰레드)

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()";
        
        String str1 = "abc";
        String str2 = "bcd";
        // 원본이 바뀜
        builder.append("abc").append("bcd").append("def");
        System.out.println(builder);

        builder.delete(0, 2); // 끝위치는 포함 안함 012 2를 포함안함.
        System.out.println(builder);
        builder.deleteCharAt(0); //요소 하나만 제거할때
        System.out.println(builder);

        builder.insert(1, "홍길동");
        System.out.println(builder);

        builder.replace(1, 3, "성춘향"); //end 3 은 리플레이스는 포함하지 않음.
        System.out.println(builder);

        builder = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");
        System.out.println(builder.equals(builder2) ? "같음" : "다름");

        // StringBuilder => String 객체로 바꾸고 싶을때

        str1 = builder.toString(); //그냥 builder를 대입해버리면 주소값을 가진것을 보내지기때문에 에러가 뜸.
        System.out.println(str1);

        str2 = new String(builder2);
        System.out.println(str1.equals(str2));

        String str3 = "안녕하세요";
        str3 += "반갑습니다";
        str3 += "Hello";
        
    }
}
