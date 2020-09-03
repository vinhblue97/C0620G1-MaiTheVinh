package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;

public class LookUp {
    boolean check = false;
    private Map<String, Vocabulary> vocabularyMap;

    public LookUp(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public String lookUp(String vocabulary) {
        String denifition = "";
        for (String vocab : vocabularyMap.keySet()) {
            if (vocab.equals(vocabulary)) {
                denifition = vocabularyMap.get(vocab).showDefinition();
                check = true;
                break;
            }
        }
        if (check) {
            return denifition;
        } else {
            return vocabulary + " is not in this dictionary";
        }
    }
}
