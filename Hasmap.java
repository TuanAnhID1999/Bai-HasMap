package HasMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hasmap {
    public static void main(String[] args) {
        // khai báo 1 HashMap có tên là hashMap
        // kiểu dữ liệu của key và value là String
        HashMap<String, String> hashMap = new HashMap<>();

        // Thêm value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        // đối số thứ nhất trong put là key có kiểu là String
        // và đối số thứ hai là value có kiểu là String
        hashMap.put("CSLT", "Cơ sở lập trình");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Ja", "Java");

        // tạo 1 Set có tên là setHashMap
        // chứa toàn bộ các entry (vừa key vừa value)
        // của hashMap
//        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
//
//        System.out.println("Các entry có trong setHashMap:");
//        System.out.println(setHashMap);
        System.out.println("Các lấy tất cả thông tin.");
        System.out.println("Các entry: ");
        hashMap.forEach((key,value) -> System.out.println("Key : "+ key + " value = "+ value));

        System.out.println("Cách lấy tất cả key.");
        for (String key: hashMap.keySet()){
            System.out.println("Key = "+ key);
        }

        System.out.println("Cách lấy tất cả value.");
        for (String value: hashMap.values()){
            System.out.println("Key = "+ value);
        }
    }
}
