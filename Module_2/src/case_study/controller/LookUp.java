package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;

public class LookUp {
    private Map<String, Vocabulary> vocabularyMap;
    private boolean check;

    public boolean isCheck() {
        return check;
    }

    public LookUp(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void menu() {
        check = true;
        Vocabulary newWord = null;
        int isExists = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the vocabulary you want to add:");
        String vocabulary = scanner.nextLine();
        for (String word : vocabularyMap.keySet()) {
            if (word.equals(vocabularyMap.get(word).getVocabulary())) {
                newWord = vocabularyMap.get(word);
                isExists = 1;
                System.out.println(word + " is allready exitsed");
            }
        }
        if (isExists == 0) {
            System.out.println("Enter the pronounciation for above vocabulary: ");
            String pronounciation = scanner.nextLine();
            newWord = new Vocabulary(vocabulary, pronounciation);
        }
        String choise = "";
        loop:
        do {
            System.out.println("1. Add noun meaning.\n" +
                    "2. Add verb meaning.\n" +
                    "3. Add adjective meaning.\n" +
                    "4. Add adverb meaning.\n" +
                    "5. Back to menu\n" +
                    "6. Exit");
            choise = scanner.nextLine();
            switch (choise) {
                case "1":
                    System.out.println("Set noun");
                    newWord.setNoun(scanner.nextLine());
                    break;
                case "2":
                    System.out.println("Set verb");
                    newWord.setVerb(scanner.nextLine());
                    break;
                case "3":
                    System.out.println("Set adjective");
                    newWord.setAdjective(scanner.nextLine());
                    break;
                case "4":
                    System.out.println("Set adverb");
                    newWord.setAdverb(scanner.nextLine());
                    break;
                case "5":
                    vocabularyMap.put(vocabulary, newWord);
                    break loop;
                case "6":
                    vocabularyMap.put(vocabulary, newWord);
                    System.out.println(vocabularyMap);
                    check = false;
                    break loop;
            }
        } while (true || Integer.parseInt(choise) % 1 != 0);
    }
}
