package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;

public class Adding {
    Map<String, Vocabulary> vocabularyMap;
    private String vocabulary;
    private String type;
    private String meaning;

    public Adding(Map<String, Vocabulary> vocabularyMap, String vocabulary, String type, String meaning) {
        this.vocabularyMap = vocabularyMap;
        this.vocabulary = vocabulary;
        this.type = type;
        this.meaning = meaning;
    }

    public Map<String, Vocabulary> checkVocab() {
        int isExist = 0;
        if (!vocabularyMap.isEmpty()) {
            loop:
            for (String vocab : vocabularyMap.keySet()) {
                if (vocab.equals(vocabulary)) {
                    for (String mean : vocabularyMap.get(vocab).getMeaningList()) {
                        if(mean.equals(meaning)){
                            isExist = 2;   //isExist 2: word has already existed
                            break loop;
                        }else {
                            isExist = 1;   // insert new meaning
                        }
                    }
                }
            }
        } else {
            isExist = 0;  // add new word
        }
        if (isExist == 0){
            addNewWord();
        }else if(isExist ==1){
            insertWord();
        }else {
            existWord();
        }
        return vocabularyMap;
    }

    public void addNewWord(){
        Vocabulary newWord = new Vocabulary(vocabulary);
        newWord.setType(type, meaning);
        vocabularyMap.put(vocabulary,newWord);
    }

    public void insertWord(){
        Vocabulary word = vocabularyMap.get(vocabulary);
        word.setType(type, meaning);
    }

    public void existWord(){
        System.out.println(vocabulary+" is existed");
    }
}

//isExist 0: new word
//isExist 1: insert word
