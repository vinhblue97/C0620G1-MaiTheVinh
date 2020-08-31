package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.TreeMap;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, Vocabulary> vocabularyMap = new TreeMap<>();
        System.out.println("");
        NewVocabulary newVocabulary = new NewVocabulary(vocabularyMap);
        newVocabulary.menu();
    }

}
