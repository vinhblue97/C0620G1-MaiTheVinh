package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;

public class Drop {
    transient Scanner scanner = new Scanner(System.in);
    private Map<String, Vocabulary> vocabularyMap;
    private String word;

    public Drop(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;

    }

    public void drop(String vocab, String meaning) {
        if (meaning.equals("")) {
            vocabularyMap.remove(vocab);
        } else {
            loop:
            for (String temp : vocabularyMap.keySet()) {
                if (temp.equals(vocab)) {
                    for (String mean : vocabularyMap.get(vocab).getNounList()) {
                        if (mean.equals(meaning)) {
                            vocabularyMap.get(vocab).getNounList().remove(meaning);
                            break loop;
                        }
                    }
                    for (String mean : vocabularyMap.get(vocab).getVerbList()) {
                        if (mean.equals(meaning)) {
                            vocabularyMap.get(vocab).getNounList().remove(meaning);
                            break loop;
                        }
                    }
                    for (String mean : vocabularyMap.get(vocab).getAdjList()) {
                        if (mean.equals(meaning)) {
                            vocabularyMap.get(vocab).getNounList().remove(meaning);
                            break loop;
                        }
                    }
                    for (String mean : vocabularyMap.get(vocab).getAdvList()) {
                        if (mean.equals(meaning)) {
                            vocabularyMap.get(vocab).getNounList().remove(meaning);
                            break loop;
                        }
                    }
                }
            }
        }
    }
}
