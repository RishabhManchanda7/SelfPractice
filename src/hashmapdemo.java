import java.security.Key;
import java.util.*;

public class hashmapdemo {
    public static void main(String args []) {

        String key1 = new String("key");
        String key2 = new String("Key");

        Map <String , Integer> list = new HashMap<>();

        list.put(key1, 22);
        list.put(key2 ,33);
        System.out.println(list);

    }
}
