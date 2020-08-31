package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NewVocabulary {
    Map<String, Vocabulary> vocabularyMap = new TreeMap<>();

    public NewVocabulary(Map<String, Vocabulary> vocabularyMap){
        this.vocabularyMap = vocabularyMap;
    }
    private boolean checkOut;

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        checkOut = true;
        loop:
        do {
            System.out.println("Enter the vocabulary you want to add:");
        String vocabulary = scanner.nextLine();
        System.out.println("Enter the pronounciation for above vocabulary: ");
        String pronounciation = scanner.nextLine();
            Vocabulary newWord = new Vocabulary(vocabulary, pronounciation);
            System.out.println("1. Add noun meaning.\n" +
                    "2. Add verb meaning.\n" +
                    "3. Add adjective meaning.\n" +
                    "4. Add adverb meaning.\n" +
                    "5. Add object meaning\n" +
                    "6. Back to menu\n" +
                    "7. Exit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    newWord.setNoun(scanner.nextLine());
                    System.out.println(newWord.getNoun());
                    break;
                case 2:
                    newWord.setVerb(scanner.nextLine());
                    break;
                case 3:
                    newWord.setAdjective(scanner.nextLine());
                    break;
                case 4:
                    newWord.setAdverb(scanner.nextLine());
                    break;
                case 5:
                    break;
                case 6:
                    vocabularyMap.put(vocabulary, newWord);
                    checkOut = false;
                    break;
                case 7:
                    vocabularyMap.put(vocabulary, newWord);
                    break loop;
            }
        } while (checkOut);


    }
}
