package case_study.controller;

import case_study.models.Vocabulary;

import java.util.Map;
import java.util.Scanner;

public class Dictionary {

    Map<String, Vocabulary> vocabularyMap;

    public Dictionary(Map<String, Vocabulary> vocabularyMap) {
        this.vocabularyMap = vocabularyMap;
    }

    public void mainMenu() {
        boolean check = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Look up\n" +
                    "2. Drop\n" +
                    "3. Export\n" +
                    "4. Look for\n" +
                    "5. Exit");
            int choise = Integer.parseInt(scanner.nextLine());
            switch (choise) {
                case 1:
                    LookUp newVocabulary = new LookUp(vocabularyMap);
                    newVocabulary.menu();
                    check = newVocabulary.isCheck();
                    break;
                case 2:
                    System.out.println("Enter the drop word");
                    String dropWrod = scanner.nextLine();
                    Drop drop = new Drop(vocabularyMap, dropWrod);
                    drop.drop();
                    break;
                case 3:
                    Export export = new Export(vocabularyMap);
                    export.export();
                    break;
                case 4:
                    LookFor lookFor = new LookFor(vocabularyMap);
                    lookFor.lookFor();
                    break;
                case 5:
                    check = false;
                    break;
            }

        } while (check);
    }
}
