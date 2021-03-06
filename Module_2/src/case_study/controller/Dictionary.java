package case_study.controller;

import case_study.commons.AnalystInput;
import case_study.models.Vocabulary;

import java.io.IOException;
import java.util.*;

public class Dictionary {

    Map<String, Vocabulary> vocabularyMap;
    Map<String, List<String>> requestList = new TreeMap<>();

    public Dictionary(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void mainMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add\n" +
                "2. lookup\n" +
                "3. delete\n" +
                "4. save\n" +
                "5. quit\n");
        loop:
        do {
            String input = scanner.nextLine();
            AnalystInput setInput = new AnalystInput(input);
            String action = setInput.getAction();
            String vocab = setInput.getVocab();
            String similar = setInput.getSimilar();
            String pronoun = setInput.getPronoun();
            String type = "";
            String meaning = "";
            if (input.length() != (action + vocab).length() + 1) {
                type = setInput.getType();
                meaning = setInput.getMeaning();
            }
            switch (action) {
                case "add":
                    Adding add = new Adding(vocabularyMap, vocab, pronoun, similar, type, meaning);
                    vocabularyMap = add.checkVocab();
                    break;
                case "drop":
                    Drop drop = new Drop(vocabularyMap);
                    drop.drop(vocab, meaning);
                    break;
                case "save":
                    Save save = new Save(vocabularyMap);
                    save.saveDictionary();
                    break;
                case "lookup":
                    LookUp lookUp = new LookUp(vocabularyMap);
                    System.out.println("------------------------RESULT------------------------");
                    System.out.println(lookUp.lookUp(vocab));
                    System.out.println("------------------------------------------------------");
                    break;
                case "quit":
                    break loop;
            }
        } while (true);
    }
}
