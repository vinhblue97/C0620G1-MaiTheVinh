package dsa_stack_queue.exercise.count_element_frequency_by_treemap;

import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        String str = "klasdokaskASLKNDOSANKOASFOIKSFNOQIWHskskjabjassxkc1232";
        Map<Character, Integer> treeMap = new TreeMap<>();
        MyTreeMap testTreeMap = new MyTreeMap(str, treeMap);
        testTreeMap.countInTree();

    }
}
