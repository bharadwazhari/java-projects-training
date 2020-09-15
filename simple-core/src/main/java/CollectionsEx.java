import java.util.*;

public class CollectionsEx {

    public static void main(String args[]) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(111, "AAAAAAAAAAAAAAAAAAA");
        map.put(222, "BBBBBBBBBBBBBBBBBBBB");
        map.put(222, "ZZZZZZZZZZZZZZZZZZZZZZZ");
        map.put(333, "CCCCCCCCCCCCCCCCCCCC");
        map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

    }
}
