package lang;
import java.util.Arrays;

public class StringEx2 {
    public static void main(String[] args) {
        // 1. concat() 문자열 제일 뒤에 덧붙인다.
        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1+str2;
        System.out.println(str3);

        System.out.println("concat() "+str1.concat(str2));
        
        // 2) contains() : 문자열 포함 여부 str3번에 str1 문자열이 포함되어있는가? 의미.
        // boolean result =str3.contains(str1);
        // System.out.println(result);

        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        }
        else
        {
            System.out.println("str3 문자열에 str1 문자열이 포함되지않음");
        }
        // 3) compareTo() : 문자열 사전순서로 비교 (앞에 문자 부터 비교)
        str1 = "aaa";
        str2 = "bbb";

        System.out.println("str1.compareTo(aaa) = " +str1.compareTo("aaa"));
        System.out.println("str1.compareTo(str2) = " +str1.compareTo(str2));
        System.out.println("str1.compareTo(str3) = " +str2.compareTo(str1));


        // 4) endWith("문자열") : 지정된 문자열로 끝나는지 검사 
        String fileName = "file1.txt";
        if (fileName.endsWith("txt")) 
        {
            System.out.println("텍스트 파일");
        }
        else
        {
            System.out.println("텍스트 파일 아님");
        }

        // 5) equals() :문자열 비교 , equalsIgnoreCase() : 대소문자 구별 없이 비교

        System.out.println("aaa".equals("ccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6) indexOf()

        str1 = "Hello";
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.indexOf('k'));
        
        
        System.out.println(str1.indexOf('e', 2)); //fromIndex == 찾을 위치(요소)
        System.out.println(str1.indexOf("el")); //el 문자열 찾는데 맨앞에 요소 위치를 리턴.
        

        // 7)lastIndexOf()

        str1 = "java.lang.Object";
        System.out.println(str1.lastIndexOf('.')); // 뒤에서부터 요소접근(**요소는 앞에서부터 012345 틀 유지)
        System.out.println(str1.indexOf('.'));
        
        // 8)length() : 문자열 길이 반환
        int arr[] = {3,4,5,6};
        for (int i = 0; i < arr.length; i++) {
            
        }
        
        // CharSequnce target ==> String의 부모이면서 인터페이스여서 String안에 것을 사용할 수 있다.
        // 9) replace()
        str1 = "Hello";
        // System.out.println(str1.replace('H', 'K'));
        // System.out.println(str1); // 원본문자를 훼손하지 않음.
        System.out.println("Hellollo".replace("ll", "LL")); // 요소에 존재하는 것을 전체를 변경한다.

        //regex : 정규식
        System.out.println("Hellollo".replaceAll("ll", "LL")); // 전체 변경
        System.out.println("Hellollo".replaceFirst("ll", "LL")); //첫번째만 변경

        
        // 10) split()
        String animals = "dog,cat,bear";
        String[] arr2 =animals.split(",");
        System.out.println(Arrays.toString(arr2)); // 클래스명.메서드 == > ** static 메서드** Arrays클래스의 오버라이딩 된 tostring 메서드를 이용하여 스플릿.
        for (String s : arr2) {
            System.out.println(s);
        }

        String[] arr3 = animals.split(",",2);

        for (String s : arr3) {
            System.out.println(s);
        }
        
        // 11) startWith(prefix) : 앞쪽 문자열 일치 확인 < == > endsWith()
        // ** 공백도 문자 ** 유념할것.
        str1 = "java.lang.Object";
        System.out.println("+str1.startsWith(\"java\")"+ str1.startsWith("java"));
        System.out.println("+str1.startsWith(\"lang\")"+ str1.startsWith("lang"));
        System.out.println("+str1.startsWith(\"lang\")"+ str1.startsWith("lang",5));

        // 12) substring()

        System.out.println(str1.substring(10)); //시작위치부터 문자열 얻어내기
        System.out.println(str1.substring(5,9)); //endidex 기준은 포함하지 않는다 ==> 즉 9를 포함하지않음

        // 13) toLowerCase() / toUpperCase()
        System.out.println("abcdefg".toUpperCase());
        System.out.println("abcdefg".toLowerCase());
        

        // 14) trim() : 양 끝에 존재하는 공백 제거(중간 공백은 제거 안해줌)
        System.out.println("             Hello World".trim());
        System.out.println("             Hello World               ".trim());
        System.out.println("             Hello           World          ".trim());
        
        // 15) valueOf(값) ==> 지정된 값을 문자열로 변환하여 반환한다. == 정수변수 + "";
        String str4 = String.valueOf(5);
        System.out.println(str4);
        int i = 3;
        str4 = i+ "";
        str4 = String.valueOf(10.3f);
        System.out.println(str4);
    }
}
