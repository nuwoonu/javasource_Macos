package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        //Map interface는 Key,Value의 구조
        // key는 중복 불가, / value 중복 가능.
        // key값을 이용해 vaule를 조회하는 것이다.
        Map<String/*(key)*/, String/*(value)*/> map = new HashMap<>();

        // 추가 == put 메서드
        map.put("1", "사과");
        map.put("2", "포도");
        map.put("3", "귤");
        map.put("4", "수박");

        // 조회
        String value = map.get("1");
        System.out.println(value);

        // 전체조회
        // key 값을 iterator 구조로 변경
        // keyset ==> 중복되면 안되어 set구조를 갖고있음
        Set<String> keyset = map.keySet();
        Iterator<String> iter =keyset.iterator();

        while (iter.hasNext()) {
           String key = iter.next();
           value = map.get(key);
           System.out.println(key + ": "+value);
        }
    }
}
