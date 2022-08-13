package classwork.lesson25;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer, String> names = new LinkedHashMap<>(400, 0.8f);

        names.put(111, "zaven");
        names.put(222, "aram");
        names.put(333, "poxos");
        names.put(555, "petros");

        String value = names.get(444);
        Set<Map.Entry<Integer, String>> entries = names.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }
}