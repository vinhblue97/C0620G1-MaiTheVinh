package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;

public class Drop {
    private Map<String, Vocabulary> vocabularyMap;
    private String word;

    public Drop(Map<String, Vocabulary> vocabularyMap, String word) {
        this.vocabularyMap = vocabularyMap;
        this.word = word;
    }

    public void drop() {
        vocabularyMap.remove(word);
        System.out.println(vocabularyMap);
    }
}
