package collection_framework.practice.hashmap_linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class TestMap {
    public static void main(String[] args){
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 23);
        hashMap.put(0, 42);
        hashMap.put(9, 14);
        hashMap.put(90, 66);
        hashMap.put(11, 26);
        System.out.println("Display hashmap");
        System.out.println(hashMap+"\n");

        Map<Integer, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display treeMap");
        System.out.println(treeMap+"\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}
