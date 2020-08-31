package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;

public class LookFor {
    Scanner scanner = new Scanner(System.in);
    Map<String, Vocabulary> vocabularyMap;

    public LookFor(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void lookFor() {
        String word = null;
        try {
            System.out.println("Looking for the word: ");
            word = scanner.nextLine();
            System.out.println(vocabularyMap.get(word).showVocabulary());
        }catch(NullPointerException e){
            System.err.println(word+" hasn't allready exitsed in this dictionary");
        }
    }
}
