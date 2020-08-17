package dsa_stack_queue.exercise.count_element_frequency_by_treemap;

import java.util.Map;

class MyTreeMap {
    private String str;
    private static Map<Character, Integer> treeMap;

    public MyTreeMap(String str, Map<Character, Integer> treeMap) {
        this.str = str.toLowerCase();
        this.treeMap = treeMap;
    }

    public void countInTree() {
        for (int index = 0; index < str.length(); index++) {
            char key = str.charAt(index);
            int value = 0;
            if (!treeMap.containsKey(key)) {
                treeMap.put(key, 1);
            } else {
                value = treeMap.get(key);
                treeMap.put(key, ++value);
            }
        }
        for (char key : treeMap.keySet()) {
            int value = treeMap.get(key);
            System.out.println(key + ": " + value);
        }
    }

}