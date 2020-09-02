package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;

public class Deleting {
    transient Scanner scanner = new Scanner(System.in);
    private Map<String, Vocabulary> vocabularyMap;
    private String word;

    public Deleting(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;

    }

    public void drop(String vocab) {
        vocabularyMap.remove(vocab);
    }
}
