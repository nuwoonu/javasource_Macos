package lang;

import java.util.Scanner;
//java.lang 패키지는 자동 import
public class ObjectEx
{
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = new Object();

        Scanner sc = new Scanner(System.in);
        
        if(object1.equals(object2))
        {
            System.out.println("같다");
        }
        else
        {
            System.out.println("다르다");
        }
        System.out.println(object1 == object2 ? "두 객체는 같다":"두 객체는다르다");

        System.out.println("object 1 "+ object1);

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        
        System.out.println(value1.equals(value2));
        System.out.println(value1);

        String str1 = "Hello", str2= "Hello";
        String str3 = new String("Hello");
        // System.out.println(str1.equals(str2) ? "str1 == Str2 " : "Str1 != str2");
        // System.out.println(str1.equals(str3) ? "str1 == Str3 " : "Str1 != str3");
        System.out.println(str1==str2 ? "str1 == Str2 " : "Str1 != str2");
        System.out.println(str1==str3 ? "str1 == Str3 " : "Str1 != str3");
        System.out.println("str3 " + str3);


    }
}